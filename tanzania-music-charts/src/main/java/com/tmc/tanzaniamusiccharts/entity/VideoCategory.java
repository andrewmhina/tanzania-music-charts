package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "video_categories")
public class VideoCategory {
   @EmbeddedId 
   private VideoCategoryId id;

   @ManyToOne(optional = false)
   @MapsId("videoId")
   @JoinColumn(name = "video_id", nullable = false)
   private Video video;
}
