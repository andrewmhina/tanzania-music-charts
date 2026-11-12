package com.tmc.tanzaniamusiccharts.repository;

import com.tmc.tanzaniamusiccharts.entity.ChannelStatistics; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelStatisticsRepository extends JpaRepository<ChannelStatistics, Long> {
    
}
