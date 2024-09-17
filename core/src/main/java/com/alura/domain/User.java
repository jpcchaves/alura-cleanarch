package com.alura.domain;

import java.util.Objects;

public class User {

  private Long id;
  private String name;
  private String cpf;
  private String email;
  private String phone;

  public User() {}

  public User(String name, String cpf, String email, String phone) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
    this.phone = phone;
  }

  public User(Long id, String name, String cpf, String email, String phone) {
    this.id = id;
    this.name = name;
    this.cpf = cpf;
    this.email = email;
    this.phone = phone;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(id, user.id) && Objects.equals(cpf, user.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cpf);
  }

  @Override
  public String toString() {
    return "User{"
        + "name='"
        + name
        + '\''
        + ", cpf='"
        + cpf
        + '\''
        + ", email='"
        + email
        + '\''
        + ", phone='"
        + phone
        + '\''
        + '}';
  }
}
