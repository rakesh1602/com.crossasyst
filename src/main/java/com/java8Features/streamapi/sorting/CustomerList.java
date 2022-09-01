package com.java8Features.streamapi.sorting;

import com.java8Features.streamapi.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerList {
   public static List<Customer> getAll(){
       List<Customer> list=new ArrayList<>();
        list.add(new Customer(101, "rakesh@gmail.com", "9619176394"));
        list.add(new Customer(102, "rajesh@gmail.com", "8719176394"));
        list.add(new Customer(103, "uttam@gmail.com", "5519176394"));
        return list;
    }

    public static List<Customer> getStream(){
       return Stream.of(
               (new Customer(101, "rakesh@gmail.com", Arrays.asList("9619176394","9619176394").toString())),
               (new Customer(101, "rakesh@gmail.com", Arrays.asList("52367532","347563475").toString()))

       ).collect(Collectors.toList());
    }
}
