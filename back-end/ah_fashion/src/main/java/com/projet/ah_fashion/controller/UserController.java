package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.User;
import com.projet.ah_fashion.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @GetMapping("/read")
    public List<User> read(){
        return userService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<User> readById(@PathVariable("id") long id){
        return userService.readById(id);
    }
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        return userService.delete(id);
    }


}
