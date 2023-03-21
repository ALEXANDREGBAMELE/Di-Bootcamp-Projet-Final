package com.projet.ah_fashion.repository;

import com.projet.ah_fashion.model.Design;
import com.projet.ah_fashion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByRole(String role);
}
