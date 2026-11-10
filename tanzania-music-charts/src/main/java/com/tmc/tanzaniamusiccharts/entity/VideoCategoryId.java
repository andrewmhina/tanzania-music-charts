package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VideoCategoryId implements Serializable {
    @Column(name = "video_id")
    private Long videoId;

    @Column(name = "category_id")
    private Long categoryId;

    public VideoCategoryId() {
    }

    public VideoCategoryId(Long videoId, Long categoryId) {
        this.videoId = videoId;
        this.categoryId = categoryId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
