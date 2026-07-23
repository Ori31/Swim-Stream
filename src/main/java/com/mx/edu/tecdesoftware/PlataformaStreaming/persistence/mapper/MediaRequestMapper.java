package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.mapper;

import com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto.MediaRequestDto;
import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.MediaRequest;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MediaRequestMapper {

    @Mappings({
        @Mapping(source = "idRequest", target = "id"),
        @Mapping(source = "requestedTitle", target = "requestedTitle"),
        @Mapping(source = "tmdbId", target = "tmdbId"),
        @Mapping(source = "mediaType", target = "mediaType"),
        @Mapping(source = "status", target = "status"),
        @Mapping(source = "requestDate", target = "requestDate"),
        @Mapping(source = "idUserRequester", target = "userId")
    })
    MediaRequestDto toMediaRequestDto(MediaRequest mediaRequest);

    List<MediaRequestDto> toMediaRequestDtos(List<MediaRequest> mediaRequests);

    @InheritInverseConfiguration
    @Mapping(target = "mediaItem", ignore = true)
    @Mapping(target = "idMedia", ignore = true)
    MediaRequest toMediaRequest(MediaRequestDto mediaRequestDto);
}
