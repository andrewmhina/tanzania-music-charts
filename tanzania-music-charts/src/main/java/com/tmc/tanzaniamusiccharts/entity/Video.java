package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity 
@Table(name = "videos")
public class Video {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "video_id", nullable = false, unique = true)
    private String videoId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "published_at")
    private LocalDateTime publishedAt;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @ManyToOne(optional = false)
    @JoinColumn(
        name = "channel_id",
        referencedColumnName = "channel_id",
        nullable = false
    )
    private Artist artist;
}
