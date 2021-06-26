package com.teacher.management.service;

import com.teacher.management.models.Book;

import java.util.List;

public interface BookService {

    public Book findByIdBook(long idBook);
    public Book save(Book book);
    public List<Book> findAll();
    public List<Book> findByTipCarte(String tipCarte);
    public List<Book> findBookByTipCarteAndIdUser(String tipCarte, Integer idUSer);
}
