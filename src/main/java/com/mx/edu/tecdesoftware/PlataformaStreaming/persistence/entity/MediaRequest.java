package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "media_requests")
public class MediaRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_request")
    private Integer idRequest;

    @Column(name = "requested_title", nullable = false, length = 150)
    private String requestedTitle;

    @Column(name = "tmdb_id")
    private Integer tmdbId;

    @Column(name = "media_type", nullable = false, length = 20)
    private String mediaType;

    @Column(nullable = false, length = 20)
    private String status = "PENDIENTE";

    @Column(name = "request_date", updatable = false)
    private LocalDateTime requestDate;

    @Column(name = "id_user_requester", nullable = false)
    private Integer idUserRequester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_media", insertable = false, updatable = false)
    private MediaItem mediaItem;

    @Column(name = "id_media", nullable = false)
    private Integer idMedia;

    @PrePersist
    protected void onCreate() {
        this.requestDate = LocalDateTime.now();
    }

    public Integer getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Integer idRequest) {
        this.idRequest = idRequest;
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

    public Integer getIdUserRequester() {
        return idUserRequester;
    }

    public void setIdUserRequester(Integer idUserRequester) {
        this.idUserRequester = idUserRequester;
    }

    public MediaItem getMediaItem() {
        return mediaItem;
    }

    public void setMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public Integer getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(Integer idMedia) {
        this.idMedia = idMedia;
    }
}
