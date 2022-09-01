package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

import java.util.Collections;
import java.util.List;
@Log4j2
public class BookService {
    public List<Book> getbooksort() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, (o1, o2) ->
                o2.getName().compareTo(o1.getName()));
        return books;
    }

    public static void main(String[] args) {
        log.info(new BookService().getbooksort());
    }
}