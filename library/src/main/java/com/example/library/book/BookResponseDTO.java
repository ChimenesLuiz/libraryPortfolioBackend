package com.example.library.book;

public record BookResponseDTO(Long id, String title, String author, Integer publishCompany, String releaseYear, Integer category, String isbn, Integer available, String status) {
    public BookResponseDTO(Book book) {
        this(book.getId(), book.getTitle(), book.getAuthor(), book.getPublishCompany(), book.getReleaseYear(), book.getCategory(), book.getIsbn(), book.getAvailable(), book.getStatus());
    }
}
