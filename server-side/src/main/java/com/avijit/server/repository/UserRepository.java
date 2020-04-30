package com.avijit.server.repository;

import com.avijit.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getById(Long id);
}
