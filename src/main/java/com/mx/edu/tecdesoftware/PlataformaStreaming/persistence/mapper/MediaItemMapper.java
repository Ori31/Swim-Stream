package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.mapper;

import com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto.MediaItemDto;
import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.MediaItem;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GenreMapper.class})
public interface MediaItemMapper {

    @Mappings({
        @Mapping(source = "idMedia", target = "id"),
        @Mapping(source = "title", target = "title"),
        @Mapping(source = "overview", target = "overview"),
        @Mapping(source = "releaseDate", target = "releaseDate"),
        @Mapping(source = "tmdbId", target = "tmdbId"),
        @Mapping(source = "mediaType", target = "mediaType"),
        @Mapping(source = "filePath", target = "filePath"),
        @Mapping(source = "posterUrl", target = "posterUrl"),
        @Mapping(source = "resolution", target = "resolution"),
        @Mapping(source = "videoCodec", target = "videoCodec"),
        @Mapping(source = "genres", target = "genres")
    })
    MediaItemDto toMediaItemDto(MediaItem mediaItem);

    List<MediaItemDto> toMediaItemDtos(List<MediaItem> mediaItems);

    @InheritInverseConfiguration
    @Mapping(target = "requests", ignore = true)
    MediaItem toMediaItem(MediaItemDto mediaItemDto);
}
