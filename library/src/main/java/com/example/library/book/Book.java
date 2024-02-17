package com.example.library.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "books")
@Table(name = "books")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer publishCompany; // pode ser uma classe Publisher
    private String releaseYear; // Deve ser uma string (por exemplo, "15/05/2023")
    private Integer category; // pode ser uma classe Category
    private String isbn;
    private Integer available;
    private String status;

    public Book(BookRequestDTO request) {
        this.title = request.title();
        this.author = request.author();
        this.publishCompany = request.publishCompany();
        this.releaseYear = request.releaseYear();
        this.category = request.category();
        this.isbn = request.isbn();
        this.available = request.available();
        this.status = request.status();

    }
}
