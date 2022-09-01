package com.java8Features.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Data @ToString @AllArgsConstructor @Log4j2
public class Employee {
    private int id;
    private String firstName;
    private long Salary;

}