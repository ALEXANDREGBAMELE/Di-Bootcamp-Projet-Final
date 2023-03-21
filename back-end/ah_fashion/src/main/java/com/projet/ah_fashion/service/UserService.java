package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User user);
    List<User> read();

    abstract User readByRole(String role);

    Optional<User> readById(Long user_id);
    User update(User user);
    String delete(Long user_id);
}
