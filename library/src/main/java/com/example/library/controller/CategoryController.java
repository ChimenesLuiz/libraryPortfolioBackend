package com.example.library.controller;

import com.example.library.category.Category;
import com.example.library.category.CategoryRepository;
import com.example.library.category.CategoryRequestDTO;
import com.example.library.category.CategoryResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")

public class CategoryController {
    @Autowired
    private CategoryRepository repository;

    @PostMapping
    public void saveCategory(@RequestBody CategoryRequestDTO request) {
        Category category = new Category(request);
        repository.save(category);
    }

    @GetMapping
    public List<CategoryResponseDTO> getAll() {
        return repository.findAll().stream().map(CategoryResponseDTO::new).toList();
    }
}
