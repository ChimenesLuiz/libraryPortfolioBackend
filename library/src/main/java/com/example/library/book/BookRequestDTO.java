package com.example.library.book;

public record BookRequestDTO(String title, String author, Integer publishCompany, String releaseYear, Integer category, String isbn, Integer available, String status) {
}
