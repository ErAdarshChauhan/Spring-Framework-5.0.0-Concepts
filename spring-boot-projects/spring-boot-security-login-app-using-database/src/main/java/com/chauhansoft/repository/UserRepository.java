package com.chauhansoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhansoft.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);	

}
