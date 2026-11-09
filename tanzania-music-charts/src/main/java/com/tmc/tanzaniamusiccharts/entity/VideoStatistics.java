package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity 
@Table(name = "video_statistics")
public class VideoStatistics {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
