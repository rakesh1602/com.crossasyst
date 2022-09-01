package com.java8Features.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data @ToString @AllArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private  long Salary;
}
