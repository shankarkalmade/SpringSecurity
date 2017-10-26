package com.shankar.security.BootSecurity.repository;

import com.shankar.security.BootSecurity.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}