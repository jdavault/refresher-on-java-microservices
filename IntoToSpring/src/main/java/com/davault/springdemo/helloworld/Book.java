package com.davault.springdemo.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Book {

    //@Autowired
    private long id;
    //@Autowired
    private String name;
    //@Autowired
    private String author;

    public Book(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
