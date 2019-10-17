package com.security.authentication.authenticationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.authentication.authenticationserver.model.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer>
{
    Optional<User> findByUsername(String name);
}
