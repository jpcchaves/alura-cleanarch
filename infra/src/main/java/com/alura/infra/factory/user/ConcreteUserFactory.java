package com.alura.infra.factory.user;

import com.alura.domain.User;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class ConcreteUserFactory implements UserFactory {

  @Override
  public User buildCoreUser(UserEntity userEntity) {

    return new User(
        userEntity.getId(),
        userEntity.getName(),
        userEntity.getCpf(),
        userEntity.getEmail(),
        userEntity.getPhone());
  }

  @Override
  public User buildCoreUser(UserRequestDTO requestDTO) {

    return new User(
        requestDTO.getName(), requestDTO.getCpf(), requestDTO.getEmail(), requestDTO.getPhone());
  }

  @Override
  public UserEntity buildUserEntity(User user) {

    return new UserEntity(user.getName(), user.getCpf(), user.getEmail(), user.getPhone());
  }
}
