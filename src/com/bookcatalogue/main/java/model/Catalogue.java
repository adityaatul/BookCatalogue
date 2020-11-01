package com.bookcatalogue.main.java.model;

import com.bookcatalogue.main.java.exception.BookAlreadyExistException;
import com.bookcatalogue.main.java.exception.InvalidBookException;
import com.bookcatalogue.main.java.service.catalogue.interfaces.AddBookToCatalogue;

import java.util.List;

public class Catalogue extends DBObject implements AddBookToCatalogue {
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

    @Override
    public void addBook(Book book) throws InvalidBookException, BookAlreadyExistException {
        if(!book.isValid()){
            throw new InvalidBookException("Invalid Book "+book.toString());
        }
        if(this.bookExist(book)){
            throw new BookAlreadyExistException("Book already present in catalogue "+this.getName());
        }
        this.books.add(book);
    }

    private boolean bookExist(Book book) {
        for (Book existingBook: this.books) {
            if(existingBook.getName().equals(book.getName())){
                return true;
            }
        }
        return false;
    }
}
