package com.java8Features.streamapi;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class EmployeeDAO {
    public static List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Rakesh", 5000));
        employees.add(new Employee(2, "Ehasn", 6000));
        employees.add(new Employee(3, "Aakash", 5000));
        employees.add(new Employee(4, "Kinchit", 50000));
        return employees;
    }

}