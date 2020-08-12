package com.chauhansoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chauhansoft.dao.BookDao;
import com.chauhansoft.model.Book;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        return (List<Book>) dao.findAll();
    }

    @Override
    public List<Book> saveBook(List<Book> book) {
        // TODO Auto-generated method stub
        return (List<Book>) dao.saveAll(book);
    }

    @Override
    public Book getBookById(int bookId) {
        // TODO Auto-generated method stub
        return dao.findByBookId(bookId);
    }


    @Override
    public List<Book> getBookByName(String bookName) {
        // TODO Auto-generated method stub
        return dao.findByBookName(bookName);
    }

    @Override
    public List<Book> deleteBookById(int id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
        return dao.findAll();
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        // TODO Auto-generated method stub
        return dao.findByAuthor(author);
    }

    @Override
    public List<Book> getBookByPrice(int prices) {
        // TODO Auto-generated method stub
        return dao.findByPrice(prices);
    }

    @Override
    public Book updateBook(Book book) {
        // TODO Auto-generated method stub
        Book existingBook = dao.findByBookId(book.getBookId());
        existingBook.setBookName(book.getBookName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        return dao.save(existingBook);
    }

    
}
