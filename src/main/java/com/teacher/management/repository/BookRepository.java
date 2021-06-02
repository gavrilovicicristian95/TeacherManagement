package com.teacher.management.repository;

import com.teacher.management.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public Book findByIdBook(long idBook);
    public Book save(Book book);
    public List<Book> findAll();
    public List<Book> findByTipCarte(String tipCarte);

}
