package com.alura.infra.persistence.repository;

import com.alura.infra.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityJpaRepository extends JpaRepository<UserEntity, Long> {}
