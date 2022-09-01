package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

import java.util.function.Supplier;

@Log4j2
public class SupplierInputDemo {
   /* @Override
    public String get() {
        return "Rakesh";
    }*/

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Rakesh with Supplier interface";
     log.info(supplier.get());

    }
}
