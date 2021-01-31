package com.isa.bookcase.controllers;

import com.isa.bookcase.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomBook {
    private final BookService bookService;

    RandomBook(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book-for-today")
    String getRandomBook() {
        return bookService.getRandomBook().toString();
    }
}
