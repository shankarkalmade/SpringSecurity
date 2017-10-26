package com.shankar.security.BootSecurity.service;

import com.shankar.security.BootSecurity.domain.RandomCity;
import com.shankar.security.BootSecurity.domain.User;

import java.util.List;


public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}