package com.rahul.SpringSecurityExample.repo;

import org.springframework.boot.security.autoconfigure.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}
