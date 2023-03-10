package com.projet.ah_fashion.repository;

import com.projet.ah_fashion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
