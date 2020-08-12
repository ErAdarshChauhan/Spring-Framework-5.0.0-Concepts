package com.chauhansoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "Book_info")
//@Setter
//@Getter
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "BookId", length = 3)
    private int bookId;
    //	@Column(name = "BookName", length = 40, unique = true, nullable = false)
    private String bookName;
    //	@Column(name = "Author", length = 40, unique = true)
    private String author;
    //	@Column(name = "Price", length = 4, unique = true)
    private int price;

//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
//                + ", getBookId()=" + getBookId() + ", getBookName()=" + getBookName() + ", getAuthor()=" + getAuthor()
//                + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//                + ", toString()=" + super.toString() + "]";
//    }
//

}
