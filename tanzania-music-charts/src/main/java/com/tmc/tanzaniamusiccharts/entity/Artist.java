package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity 
@Table(name = "artists")
public class Artist {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "channel_id", nullable = false, unique = true)
    private String channelId;

    @Column (name = "channel_name", nullable = false)
    private String channelName;

    @Column (name = "thumbnail_url")
    private String thumbnailUrl;
}
