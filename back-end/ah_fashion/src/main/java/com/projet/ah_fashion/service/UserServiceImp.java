package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.User;
import com.projet.ah_fashion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImp implements UserService{
    private UserRepository userRepository;
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> read() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> readById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User update(User user) {
        return userRepository.findById(user.getId())
                .map(
                user1 -> {
                    user1.setFirstname(user.getFirstname());
                    user1.setLastname(user.getLastname());
                    user1.setUsername(user.getUsername());
                    user1.setBurhDay(user.getBurhDay());
                    user1.setTall(user.getTall());
                    user1.setWeight(user.getWeight());
                    return userRepository.save(user1);
                }) .orElseThrow(() -> new RuntimeException("Objet not fund !"));
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "deleted succefuly";
    }
}
