package com.bookcatalogue.main.java.model;

public class Publisher extends DBObject{
    private final String name;
    //TODO :: Think for other fields of publisher

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
