package com.java8Features.streamapi.sorting;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class SortUsingLamba {


    public static void main(String[] args) {
        //customer ->customer.getEmail() one to one mapping
        List<Customer> customers=CustomerList.getAll();
        List<String> emails=customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        log.info(emails);

        List<String> phoneNumber=customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        log.info(phoneNumber);


        /*List<String> phoneNumber1=customers.stream().flatMap(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        log.info(phoneNumber1);*/

        //One to Many Mapping
        //List<String> phone= customers.stream().flatMap(customer -> customer.getPhoneNumb)
    }
}
