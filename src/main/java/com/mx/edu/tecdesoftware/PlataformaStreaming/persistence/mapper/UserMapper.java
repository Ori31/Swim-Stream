package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.mapper;

import com.mx.edu.tecdesoftware.PlataformaStreaming.domain.dto.UserDto;
import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
        @Mapping(source = "idUser", target = "id"),
        @Mapping(source = "username", target = "username"),
        @Mapping(source = "password", target = "password"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "role", target = "role")
    })
    UserDto toUserDto(User user);

    List<UserDto> toUserDtos(List<User> users);

    @InheritInverseConfiguration
    User toUser(UserDto userDto);
}
