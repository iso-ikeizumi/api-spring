package com.projeto.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}