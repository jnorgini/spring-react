package com.norgini.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.norgini.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
