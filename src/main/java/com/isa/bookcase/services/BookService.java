package com.isa.bookcase.services;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class BookService {

    private final Books books;

    @Autowired
    public BookService(Books books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books.getBooks();
    }

    public Book getRandomBook() {
        List<Book> books = getBooks();

        Random rand = new Random();
        return books.get(rand.nextInt(books.size()));
    }

    public List<Book> findBook(String title) {
        return getBooks()
                .stream()
                .filter(p -> p.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}
