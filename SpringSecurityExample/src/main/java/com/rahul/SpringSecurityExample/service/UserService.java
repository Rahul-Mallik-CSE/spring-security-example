package com.rahul.SpringSecurityExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.SpringSecurityExample.model.Users;
import com.rahul.SpringSecurityExample.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public Users register(Users user) {
        
       return repo.save(user);
       
        
    }
}