package com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto;

import java.util.List;

public class GenreDto {

    private Integer id;
    private String name;
    private List<MediaItemDto> mediaItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MediaItemDto> getMediaItems() {
        return mediaItems;
    }

    public void setMediaItems(List<MediaItemDto> mediaItems) {
        this.mediaItems = mediaItems;
    }
}
