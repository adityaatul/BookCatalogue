package com.bookcatalogue.main.java.model;

import java.util.List;

public class Category extends DBObject{
    private final CategoryType categoryType;
    List<Book> books;

    public Category(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
