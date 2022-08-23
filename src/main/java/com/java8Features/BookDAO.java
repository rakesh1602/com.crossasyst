package com.java8Features;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;


public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(101,"Core Java", 400));
        books.add(new Book(102,"Web Design", 600));
        books.add(new Book(103,"Angular", 1000));
        books.add(new Book(104,"Spring", 700));


        return books;
    }

}
