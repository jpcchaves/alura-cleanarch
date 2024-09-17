package com.alura.infra.persistence.entity;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(
    name = "TB_USERS",
    uniqueConstraints = {
      @UniqueConstraint(name = "unique_cpf", columnNames = "cpf"),
      @UniqueConstraint(name = "unique_email", columnNames = "email")
    })
@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1)
public class UserEntity implements Serializable {

  @Serial private static final long serialVersionUID = 2900328734316968310L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(length = 11, unique = true, nullable = false)
  private String cpf;

  @Column(unique = true, nullable = false)
  private String email;

  @Column(length = 20, nullable = false)
  private String phone;

  public UserEntity() {}

  public UserEntity(String name, String cpf, String email, String phone) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
    this.phone = phone;
  }

  public UserEntity(Long id, String name, String cpf, String email, String phone) {
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
    UserEntity that = (UserEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(cpf, that.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cpf);
  }

  @Override
  public String toString() {
    return "UserEntity{"
        + "id="
        + id
        + ", name='"
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
