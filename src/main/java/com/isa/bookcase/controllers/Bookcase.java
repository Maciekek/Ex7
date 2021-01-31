package com.isa.bookcase.controllers;

import com.isa.bookcase.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Bookcase {
    private final BookService bookService;

    Bookcase(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    String getBooks() {
        return bookService.getBooks().toString();
    }

}
