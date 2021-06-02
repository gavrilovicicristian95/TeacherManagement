package com.teacher.management.controllers;

import com.teacher.management.models.Book;
import com.teacher.management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService bookService;

    @PostMapping("/addBook")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        bookService.save(book);

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping("/getBook/{idBook}")
    public Book findByIdBook(@PathVariable int idBook){
        return bookService.findByIdBook(idBook);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/getBooks/{tipCarte}")
    public List<Book> getBooksByTipCarte(@PathVariable String tipCarte){
        return bookService.findByTipCarte(tipCarte);
    }
}
