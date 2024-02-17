package com.example.library.category;

public record CategoryResponseDTO(Long id ,String name) {
    public CategoryResponseDTO(Category category) {
        this(category.getId() ,category.getName());
    }
}
