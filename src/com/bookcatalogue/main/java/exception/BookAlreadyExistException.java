package com.bookcatalogue.main.java.exception;

public class BookAlreadyExistException extends Throwable {
    public BookAlreadyExistException(String message) {
        super(message);
    }
}
