package com.shankar.security.BootSecurity.repository;

import com.shankar.security.BootSecurity.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}