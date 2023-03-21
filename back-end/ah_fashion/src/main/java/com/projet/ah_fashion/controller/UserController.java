package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.User;
import com.projet.ah_fashion.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @GetMapping("/user")
    public List<User> read(){
        return userService.read();
    }
    @GetMapping("/userById/{user_id}")
    public Optional<User> readById(@PathVariable("user_id") long user_id){
        return userService.readById(user_id);
    }
    //    methode de recuperation d'objet par son role
    @GetMapping("/userByRole/{role}")
    public User readByRole(@PathVariable("role") String role){
        return userService.readByRole(role);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/user/{user_id}")
    public String delete(@PathVariable("user_id") long user_id){
        return userService.delete(user_id);
    }


}
