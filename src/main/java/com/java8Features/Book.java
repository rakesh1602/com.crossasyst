package com.java8Features;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2 @Getter @Setter @ToString
public class Book {

    public Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    private int id;
    private String name;
    private int pages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
