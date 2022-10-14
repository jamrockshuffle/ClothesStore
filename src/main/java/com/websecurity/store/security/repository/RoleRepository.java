package com.websecurity.store.security.repository;

import com.websecurity.store.security.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(Role.ERole name);
}
