package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.mapper;

import com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto.GenreDto;
import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GenreMapper {

    @Mappings({
        @Mapping(source = "idGenre", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(target = "mediaItems", ignore = true)
    })
    GenreDto toGenreDto(Genre genre);

    List<GenreDto> toGenreDtos(List<Genre> genres);

    @Mappings({
        @Mapping(source = "id", target = "idGenre"),
        @Mapping(source = "name", target = "name"),
        @Mapping(target = "mediaItems", ignore = true)
    })
    Genre toGenre(GenreDto genreDto);
}
