document.addEventListener("DOMContentLoaded", function () {

    const searchInput = document.getElementById("searchInput");
    const searchButton = document.getElementById("searchButton");
    const chartRows = document.querySelectorAll(".chart-table tbody tr");

    function searchVideos() {

        const searchValue = searchInput.value.toLowerCase().trim();

        chartRows.forEach(function (row) {

            const rowText = row.textContent.toLowerCase();

            if (rowText.includes(searchValue)) {
                row.style.display = "";
            } else {
                row.style.display = "none";
            }
        });
    }

    searchButton.addEventListener("click", searchVideos);

    searchInput.addEventListener("keyup", function (event) {

        if (event.key === "Enter") {
            searchVideos();
        }
    });
});