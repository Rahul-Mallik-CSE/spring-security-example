package com.rahul.SpringSecurityExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rahul.SpringSecurityExample.model.UserPrinciple;
import com.rahul.SpringSecurityExample.model.Users;
import com.rahul.SpringSecurityExample.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user1 = repo.findByUsername(username);
        if(user1 == null){
            System.out.println("User not found with username: " + username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserPrinciple(user1);
    }

}
