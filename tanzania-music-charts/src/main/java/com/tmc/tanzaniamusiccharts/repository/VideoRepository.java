package com.tmc.tanzaniamusiccharts.repository;

import com.tmc.tanzaniamusiccharts.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Optional<Video> findByVideoId(String videoId);
}
