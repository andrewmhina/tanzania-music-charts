package com.tmc.tanzaniamusiccharts.service;

import com.tmc.tanzaniamusiccharts.entity.Artist;
import com.tmc.tanzaniamusiccharts.repository.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Optional<Artist> updateArtist(Long id, Artist updatedArtist) {
        return artistRepository.findById(id)
        .map(existingArtist -> {
            existingArtist.setChannelId(updatedArtist.getChannelId());
            existingArtist.setChannelName(updatedArtist.getChannelName());
            existingArtist.setThumbnailUrl(updatedArtist.getThumbnailUrl());

            return artistRepository.save(existingArtist);
        });
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
