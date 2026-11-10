package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity 
@Table(name = "chart_snapshots")
@Getter 
@Setter
public class ChartSnapshot {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chart_type")
    private String chartType;

    @ManyToOne 
    @JoinColumn(name = "category_id")
    private Category category;

    private String period;

    @Column(name = "snapshot_at")
    private LocalDateTime snapshotAt;
}
