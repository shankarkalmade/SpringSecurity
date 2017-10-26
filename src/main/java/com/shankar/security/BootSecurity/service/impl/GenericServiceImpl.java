package com.shankar.security.BootSecurity.service.impl;

import com.shankar.security.BootSecurity.domain.RandomCity;
import com.shankar.security.BootSecurity.domain.User;
import com.shankar.security.BootSecurity.repository.RandomCityRepository;
import com.shankar.security.BootSecurity.repository.UserRepository;
import com.shankar.security.BootSecurity.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
