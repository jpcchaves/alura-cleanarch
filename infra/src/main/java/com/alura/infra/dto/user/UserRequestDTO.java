package com.alura.infra.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class UserRequestDTO {

  @NotBlank private String name;
  @NotBlank @CPF private String cpf;
  @NotBlank @Email private String email;
  @NotBlank private String phone;

  public UserRequestDTO() {}

  public UserRequestDTO(String name, String cpf, String email, String phone) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
