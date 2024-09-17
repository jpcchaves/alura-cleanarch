package com.alura.infra.service;

import com.alura.infra.dto.common.Response;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.dto.user.UserResponseDTO;

public interface UserService {

  Response<UserResponseDTO> create(UserRequestDTO requestDTO);
}
