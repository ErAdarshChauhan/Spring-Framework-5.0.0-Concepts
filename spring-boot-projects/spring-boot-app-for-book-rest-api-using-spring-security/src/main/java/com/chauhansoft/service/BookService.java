package com.chauhansoft.service;

import java.util.List;

import com.chauhansoft.model.Book;

public interface BookService {

    List<Book> getAllBooks();

    List<Book> saveBook(List<Book> book);

    Book getBookById(int bookId);

    List<Book> getBookByName(String bookName);

    List<Book> deleteBookById(int id);

    List<Book> getBookByAuthor(String author);

    List<Book> getBookByPrice(int prices);

    Book updateBook(Book book);

}
