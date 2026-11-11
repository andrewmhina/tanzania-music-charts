package com.tmc.tanzaniamusiccharts.controller;

import com.tmc.tanzaniamusiccharts.entity.Artist;
import com.tmc.tanzaniamusiccharts.service.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/api/artists")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    // Get all artists
    @GetMapping 
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    // Get artist by ID
    @GetMapping("/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long id) {
        return artistService.getArtistById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    // Add a new artist
    @PostMapping 
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.saveArtist(artist);
    }

    // Update artist by ID
    @PutMapping("/{id}")
    public ResponseEntity<Artist> updateArtist (
        @PathVariable Long id,
        @RequestBody Artist artist
    ) {
        return artistService.updateArtist(id, artist)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    // Delete artist by ID
    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.deleteArtist(id);
    }
}
