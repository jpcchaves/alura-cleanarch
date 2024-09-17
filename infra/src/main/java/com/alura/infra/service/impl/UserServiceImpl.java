package com.alura.infra.service.impl;

import com.alura.domain.User;
import com.alura.infra.dto.common.Response;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.dto.user.UserResponseDTO;
import com.alura.infra.service.UserService;
import com.alura.infra.util.mapper.UserMapper;
import com.alura.usecase.user.CreateUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final CreateUserUseCase createUserUseCase;
  private final UserMapper userMapper;

  public UserServiceImpl(CreateUserUseCase createUserUseCase, UserMapper userMapper) {
    this.createUserUseCase = createUserUseCase;
    this.userMapper = userMapper;
  }

  @Override
  public Response<UserResponseDTO> create(UserRequestDTO requestDTO) {

    User user = userMapper.toCore(requestDTO);

    user = createUserUseCase.create(user);

    UserResponseDTO responseDTO = userMapper.toResponseDTO(user);

    return Response.withData(responseDTO);
  }
}
