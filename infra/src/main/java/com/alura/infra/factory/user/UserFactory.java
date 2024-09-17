package com.alura.infra.factory.user;

import com.alura.domain.User;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.persistence.entity.UserEntity;

public interface UserFactory {

  User buildCoreUser(UserEntity userEntity);

  User buildCoreUser(UserRequestDTO requestDTO);

  UserEntity buildUserEntity(User user);
}
