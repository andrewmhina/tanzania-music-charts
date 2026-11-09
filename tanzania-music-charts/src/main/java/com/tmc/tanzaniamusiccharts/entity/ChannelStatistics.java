package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity 
@Table(name = "channel_statistics")
public class ChannelStatistics {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(
        name = "channel_id",
        referencedColumnName = "channel_id",
        nullable = false
    )
    private Artist artist;

    @Column(name = "subscriber_count")
    private Long subscriberCount;

    @Column(name = "view_count")
    private Long viewCount;

    @Column(name = "collected_at", nullable = false)
    private LocalDateTime collectedAt;

    // Default constructor
    public ChannelStatistics() {

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Long getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(Long subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public LocalDateTime getCollectedAt() {
        return collectedAt;
    }

    public void setCollectedAt(LocalDateTime collectedAt) {
        this.collectedAt = collectedAt;
    }
}
