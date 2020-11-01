package com.bookcatalogue.main.java.model;

public class Book extends DBObject{
    private final String name;
    private final Author author;
    private final Publisher publisher;
    //Assumption : Book belongs to single category
    private final Category category;
    private final Price price;
    int copiesSold;

    //TODO : We can write a builder later

    public Book(String name, Author author, Publisher publisher, Category category, Price price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Category getCategory() {
        return category;
    }

    public Price getPrice() {
        return price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }
}
