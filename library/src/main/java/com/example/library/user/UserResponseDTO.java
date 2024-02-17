package com.example.library.user;

public record UserResponseDTO(Long id ,String name, String email, String password, Boolean status) {
    public UserResponseDTO(User user) {
        this(user.getId() ,user.getName(), user.getEmail(), user.getPassword(), user.getStatus());
    }
}