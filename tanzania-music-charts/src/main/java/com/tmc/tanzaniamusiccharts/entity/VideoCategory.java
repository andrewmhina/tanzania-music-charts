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

   @ManyToOne(optional = false)
   @MapsId("categoryId")
   @JoinColumn(name = "category_id", nullable = false)
   private Category category;

   public VideoCategory() {
   }

   public VideoCategory(Video video, Category category) {
    this.video = video;
    this.category = category;
    this.id = new VideoCategoryId(video.getId(), category.getId());
   }

   public VideoCategoryId getId() {
    return id;
   }

   public void setId(VideoCategoryId id) {
    this.id = id;
   }

   public Video getVideo() {
    return video;
   }

   public void setVideo(Video video) {
    this.video = video;
   }

   public Category getCategory() {
    return category;
   }

   public void setCategory(Category category) {
    this.category = category;
   }
}
