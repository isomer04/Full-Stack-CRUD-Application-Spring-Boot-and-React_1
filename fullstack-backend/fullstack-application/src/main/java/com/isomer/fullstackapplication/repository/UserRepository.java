package com.isomer.fullstackapplication.repository;

import com.isomer.fullstackapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
