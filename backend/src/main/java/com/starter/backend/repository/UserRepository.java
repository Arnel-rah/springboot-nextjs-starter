package com.starter.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starter.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
