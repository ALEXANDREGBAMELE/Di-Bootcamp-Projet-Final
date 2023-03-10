package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User user);
    List<User> read();
    Optional<User> readById(Long id);
    User update(User user);
    String delete(Long id);
}
