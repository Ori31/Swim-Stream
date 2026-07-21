package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "media_items")
public class MediaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_media")
    private Integer idMedia;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(length = 1000)
    private String overview;

    @Column(name = "media_type", nullable = false, length = 20)
    private String mediaType;

    @Column(name = "file_path", unique = true)
    private String filePath;

    @Column(name = "poster_url", length = 300)
    private String posterUrl;

    @OneToMany(mappedBy = "mediaItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MediaRequest> requests;

    public Integer getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(Integer idMedia) {
        this.idMedia = idMedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public List<MediaRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<MediaRequest> requests) {
        this.requests = requests;
    }
}
