package com.alura.infra.controller;

import com.alura.infra.dto.common.Response;
import com.alura.infra.dto.user.UserRequestDTO;
import com.alura.infra.dto.user.UserResponseDTO;
import com.alura.infra.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public ResponseEntity<Response<UserResponseDTO>> create(@RequestBody UserRequestDTO requestDTO) {

    return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(requestDTO));
  }
}
