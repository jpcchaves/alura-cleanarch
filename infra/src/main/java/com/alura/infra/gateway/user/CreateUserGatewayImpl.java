package com.alura.infra.gateway.user;

import com.alura.application.user.gateway.CreateUserGateway;
import com.alura.domain.User;
import com.alura.infra.persistence.entity.UserEntity;
import com.alura.infra.persistence.repository.UserEntityJpaRepository;
import com.alura.infra.util.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateUserGatewayImpl implements CreateUserGateway {

  private final UserEntityJpaRepository userRepository;
  private final UserMapper userMapper;

  public CreateUserGatewayImpl(UserEntityJpaRepository userRepository, UserMapper userMapper) {
    this.userRepository = userRepository;
    this.userMapper = userMapper;
  }

  @Override
  public User create(User user) {

    UserEntity userEntity = userMapper.toEntity(user);

    userEntity = userRepository.save(userEntity);

    return userMapper.toCore(userEntity);
  }
}
