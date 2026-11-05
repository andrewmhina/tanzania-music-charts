document.addEventListener("DOMContentLoaded", function () {

    const searchInput = document.getElementById("searchInput");
    const searchButton = document.getElementById("searchButton");

    const chartRows = document.querySelectorAll(
        ".chart-table tbody tr"
    );

    const categoryButtons = document.querySelectorAll(
        ".chart-categories button"
    );

    let selectedCategory = "all";

    function filterVideos() {
        let visibleVideos = 0;

        const searchValue = searchInput.value.toLowerCase().trim();

        chartRows.forEach(function (row) {

            const rowText = row.textContent.toLowerCase();
            const videoCategory = row.dataset.category;

            const matchesSearch = rowText.includes(searchValue);

            const matchesCategory =
                selectedCategory === "all" ||
                videoCategory === selectedCategory;

            if (matchesSearch && matchesCategory) {
                row.style.display = "";
                visibleVideos++;
            } else {
                row.style.display = "none";
            }

        });
        const noResults = document.getElementById("noResults");

        noResults.style.display = visibleVideos === 0 ? "block" : "none";
    }

    // Search functionality
    searchButton.addEventListener("click", filterVideos);

    searchInput.addEventListener("keyup", function (event) {
        if (event.key === "Enter") {
            filterVideos();
        }
    });

    // Category filtering
    categoryButtons.forEach(function (button) {

        button.addEventListener("click", function () {

            selectedCategory = button.dataset.filter;

            categoryButtons.forEach(function (categoryButton) {
                categoryButton.classList.remove("active");
            });

            button.classList.add("active");

            filterVideos();

        });

    });

});
