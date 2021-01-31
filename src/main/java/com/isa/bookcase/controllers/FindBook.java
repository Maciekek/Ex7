package com.isa.bookcase.controllers;

import com.isa.bookcase.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindBook {
    private final BookService bookService;

    FindBook(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{title}/search")
    String search(@PathVariable("title") String title) {
        return bookService.findBook(title).toString();
    }


}
