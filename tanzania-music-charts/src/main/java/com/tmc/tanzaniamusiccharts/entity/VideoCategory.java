package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "video_categories")
public class VideoCategory {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(length = 255)
    private String description;
}
