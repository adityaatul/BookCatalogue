package com.bookcatalogue.main.java.model;

import java.util.List;

public class Catalogue extends DBObject{
    String name;
    List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBookToCatalogue(Book book){
        this.books.add(book);
    }

}
