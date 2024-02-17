package com.example.library.controller;

import com.example.library.user.User;
import com.example.library.user.UserRequestDTO;
import com.example.library.user.UserResponseDTO;
import com.example.library.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    //Interface que vai comunicar com o banco de dados
    @Autowired
    private UserRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveUser(@RequestBody UserRequestDTO request) {
        User user = new User(request);
        repository.save(user);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<UserResponseDTO> getAll() {
        return repository.findAll().stream().map(UserResponseDTO::new).toList();
    }

}
