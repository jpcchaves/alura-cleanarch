package com.alura.infra.util.mapper;

import com.alura.domain.User;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.dto.user.UserResponseDTO;
import com.alura.infra.factory.user.UserFactory;
import com.alura.infra.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

  private final UserFactory userFactory;

  public UserMapperImpl(UserFactory userFactory) {
    this.userFactory = userFactory;
  }

  @Override
  public UserEntity toEntity(User user) {

    return userFactory.buildUserEntity(user);
  }

  @Override
  public User toCore(UserEntity userEntity) {

    return userFactory.buildCoreUser(userEntity);
  }

  @Override
  public User toCore(UserRequestDTO requestDTO) {

    return userFactory.buildCoreUser(requestDTO);
  }

  @Override
  public UserResponseDTO toResponseDTO(User user) {

    return new UserResponseDTO(1L, user.getName(), user.getEmail());
  }
}
