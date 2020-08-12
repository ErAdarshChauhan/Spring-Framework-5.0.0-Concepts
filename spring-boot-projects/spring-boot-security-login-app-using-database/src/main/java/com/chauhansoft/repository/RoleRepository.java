package com.chauhansoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhansoft.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
