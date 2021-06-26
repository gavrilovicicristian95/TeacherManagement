package com.teacher.management.controllers;

import com.teacher.management.models.Book;
import com.teacher.management.service.BookService;
import com.teacher.management.util.ArticleScores;
import com.teacher.management.util.BooksScores;
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
    private final BooksScores booksScores;

    @PostMapping("/addBook")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        book.setPunctaj(booksScores.getArticleScore(book.getNrPagini(),book.getNrAutori(),book.getTipCarte()));
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


    @GetMapping("/getBooksByUser/{tipCarte}/{userId}")
    public List<Book> getBooksByTipCarteAndUserId(@PathVariable String tipCarte,@PathVariable Integer userId){
        return bookService.findBookByTipCarteAndIdUser(tipCarte, userId);
    }
}
