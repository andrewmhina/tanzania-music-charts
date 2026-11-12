package com.tmc.tanzaniamusiccharts.repository;

import com.tmc.tanzaniamusiccharts.entity.VideoCategory;
import com.tmc.tanzaniamusiccharts.entity.VideoCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoCategoryRepository extends JpaRepository<VideoCategory, VideoCategoryId> {
    
}
