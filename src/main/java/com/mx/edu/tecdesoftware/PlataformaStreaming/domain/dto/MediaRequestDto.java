package com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto;

import java.time.LocalDateTime;

public class MediaRequestDto {

    private Integer id;
    private String requestedTitle;
    private Integer tmdbId;
    private String mediaType;
    private String status;
    private LocalDateTime requestDate;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestedTitle() {
        return requestedTitle;
    }

    public void setRequestedTitle(String requestedTitle) {
        this.requestedTitle = requestedTitle;
    }

    public Integer getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
