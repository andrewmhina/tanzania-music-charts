package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "artist_features")
@Getter
@Setter
public class ArtistFeature {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @ManyToOne 
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    @Column(name = "relationship_type")
    private String relationshipType;
}
