package com.teacher.management.service.impl;

import com.teacher.management.models.Book;
import com.teacher.management.repository.BookRepository;
import com.teacher.management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    @Override
    public Book findByIdBook(long idBook) {
        return bookRepository.findByIdBook(idBook);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByTipCarte(String tipCarte) {
        return bookRepository.findByTipCarte(tipCarte);
    }

    @Override
    public List<Book> findBookByTipCarteAndIdUser(String tipCarte, Integer idUSer) {
        return bookRepository.findBookByTipCarteAndIdUser(tipCarte, idUSer);
    }
}
