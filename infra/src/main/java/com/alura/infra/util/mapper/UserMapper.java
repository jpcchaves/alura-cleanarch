package com.alura.infra.util.mapper;

import com.alura.domain.User;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.dto.user.UserResponseDTO;
import com.alura.infra.persistence.entity.UserEntity;

public interface UserMapper {

  UserEntity toEntity(User user);

  User toCore(UserEntity userEntity);

  User toCore(UserRequestDTO requestDTO);

  UserResponseDTO toResponseDTO(User user);
}
