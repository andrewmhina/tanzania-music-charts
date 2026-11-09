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
}
