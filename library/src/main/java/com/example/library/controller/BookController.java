package com.example.library.controller;

import com.example.library.book.Book;
import com.example.library.book.BookRepository;
import com.example.library.book.BookRequestDTO;
import com.example.library.book.BookResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveBook(@RequestBody BookRequestDTO request) {
        Book book = new Book(request);
        repository.save(book);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<BookResponseDTO> getAll() {
        return repository.findAll().stream().map(BookResponseDTO::new).toList();
    }
}
