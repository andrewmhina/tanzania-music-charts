package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "chart_entries")
@Getter 
@Setter
public class ChartEntry {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "chart_snapshot_id", nullable = false)
    private ChartSnapshot chartSnapshot;

    @ManyToOne 
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    @Column(nullable = false)
    private Integer rank;
}
