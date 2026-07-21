package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.crud;

import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.MediaItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MediaItemRepository extends CrudRepository<MediaItem, Integer> {

    List<MediaItem> findByMediaType(String mediaType);

    List<MediaItem> findByTitleContainingIgnoreCase(String title);
}
