package com.davault.springdemo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    //@Autowired
    private Book book;

    //@Autowired
    private ArrayList<Book> books;

//    public BooksController(Book book, ArrayList<Book> books) {
//        this.book = book;
//        this.books = books;
//    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Joe and Grett", "Joe Davault"));
        books.add(new Book(2, "Hans and Grett", "John Howell"));
        books.add(new Book(3, "John and Grett3", "Steve Smith"));
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable long id){
        Book newBook = new Book(id, "Mastering Java 2.1" + id, "Davault");
        return newBook;
    }

}
