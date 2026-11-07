package com.tmc.tanzaniamusiccharts.repository;

import com.tmc.tanzaniamusiccharts.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    
}
