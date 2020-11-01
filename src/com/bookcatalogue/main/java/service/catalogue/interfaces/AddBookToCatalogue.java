package com.bookcatalogue.main.java.service.catalogue.interfaces;

import com.bookcatalogue.main.java.exception.BookAlreadyExistException;
import com.bookcatalogue.main.java.exception.InvalidBookException;
import com.bookcatalogue.main.java.model.Book;

public interface AddBookToCatalogue {
    public void addBook(Book book) throws InvalidBookException, BookAlreadyExistException;
}
