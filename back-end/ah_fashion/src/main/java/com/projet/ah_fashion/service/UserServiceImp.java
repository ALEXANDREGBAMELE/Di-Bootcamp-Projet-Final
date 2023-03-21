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
    public User readByRole(String role){
        Optional<User> userOptionlal=userRepository.findByRole(role);
        if(userOptionlal.isPresent()){
            return userOptionlal.get();
        }

        return null;
    }
    @Override
    public Optional<User> readById(Long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public User update(User user) {
        return userRepository.findById(user.getUser_id())
                .map(
                user1 -> {
                    user1.setFirstname(user.getFirstname());
                    user1.setLastname(user.getLastname());
                    user1.setUsername(user.getUsername());
                    user1.setBurhDay(user.getBurhDay());
                    user1.setTall(user.getTall());
                    user1.setWeight(user.getWeight());
                    user1.setRole(user.getRole());
                    return userRepository.save(user1);
                }) .orElseThrow(() -> new RuntimeException("Objet not fund !"));
    }

    @Override
    public String delete(Long user_id) {
        userRepository.deleteById(user_id);
        return "deleted succefuly";
    }
}
