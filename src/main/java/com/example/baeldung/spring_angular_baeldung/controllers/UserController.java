package com.example.baeldung.spring_angular_baeldung.controllers;

import com.example.baeldung.spring_angular_baeldung.models.User;
import com.example.baeldung.spring_angular_baeldung.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }


}
