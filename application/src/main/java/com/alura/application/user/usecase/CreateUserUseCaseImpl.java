package com.alura.application.user.usecase;

import com.alura.application.user.gateway.CreateUserGateway;
import com.alura.domain.User;
import com.alura.usecase.user.CreateUserUseCase;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

  private final CreateUserGateway createUserGateway;

  public CreateUserUseCaseImpl(CreateUserGateway createUserGateway) {
    this.createUserGateway = createUserGateway;
  }

  @Override
  public User create(User user) {

    return createUserGateway.create(user);
  }
}
