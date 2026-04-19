package com.rahul.SpringSecurityExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.SpringSecurityExample.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
   
    Users findByUsername(String username);
}
