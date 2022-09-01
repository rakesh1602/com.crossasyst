package com.java8Features.JavaTechie;

import com.java8Features.streamapi.Employee;
import com.java8Features.streamapi.sorting.Customer;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.util.Currency;
import java.util.Objects;
import java.util.Optional;

@Log4j2
public class OptionalExample {
    public static void main(String[] args) {

        Employee employee = new Employee(101, null, 324244);
        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        log.info(emptyOptional);

        Optional<String> emptyOptional2=Optional.ofNullable(employee.getFirstName());
        log.info(emptyOptional2);
    }
}
