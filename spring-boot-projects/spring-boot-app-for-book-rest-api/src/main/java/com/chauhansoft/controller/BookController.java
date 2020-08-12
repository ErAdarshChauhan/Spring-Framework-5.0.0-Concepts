package com.chauhansoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chauhansoft.model.Book;
import com.chauhansoft.service.BookService;
import com.chauhansoft.service.BookServiceImpl;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/")
    public String books() {
    	log.info("/");
        return "Please perform Book Operations.";
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
    	log.info("getAllBooks() called........");
        return service.getAllBooks();
    }

    @PostMapping("/saveBook")
    public List<Book> saveBook(@RequestBody List<Book> book) {
        System.out.println(book.size());
        return service.saveBook(book);
    }

    @GetMapping("/getBookById/{bookId}")
    public Book getBookById(@PathVariable String bookId) {
        int id = Integer.parseInt(bookId);
        return service.getBookById(id);
    }

    @GetMapping("/getBookByName/{bookName}")
    public List<Book> getBookByName(@PathVariable String bookName) {
        return service.getBookByName(bookName);
    }

    @DeleteMapping("/deleteBookById/{bookId}")
    public List<Book> deleteBookById(@PathVariable String bookId) {
        int id = Integer.parseInt(bookId);
        return service.deleteBookById(id);
    }

    @GetMapping("/getBookByAuthor/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author) {
        List<Book> book = service.getBookByAuthor(author);
        System.out.println(book.size());
        return book;
    }

    @GetMapping("/getBookByPrice/{price}")
    public List<Book> getBookByPrice(@PathVariable String price) {
        int prices = Integer.parseInt(price);
        List<Book> book = service.getBookByPrice(prices);
        System.out.println("No. of Books are : " + book.size());
        return book;
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {

        return service.updateBook(book);
    }

}
