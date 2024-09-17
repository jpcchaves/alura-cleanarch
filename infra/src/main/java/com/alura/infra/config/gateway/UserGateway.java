package com.alura.infra.config.gateway;

import com.alura.application.user.gateway.CreateUserGateway;
import com.alura.application.user.usecase.CreateUserUseCaseImpl;
import com.alura.usecase.user.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserGateway {

  @Bean
  public CreateUserUseCase createUserUseCase(CreateUserGateway createUserGateway) {

    return new CreateUserUseCaseImpl(createUserGateway);
  }
}
