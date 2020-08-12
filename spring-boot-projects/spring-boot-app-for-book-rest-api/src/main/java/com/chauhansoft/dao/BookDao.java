package com.chauhansoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhansoft.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

    Book findByBookId(int bookId);

    List<Book> findByBookName(String bookName);

    List<Book> findByAuthor(String author);

    List<Book> findByPrice(int price);
}
