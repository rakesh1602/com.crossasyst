package com.java8Features.streamapi;

import lombok.extern.log4j.Log4j2;

import java.util.Comparator;
import java.util.stream.Collectors;

import static com.java8Features.streamapi.EmployeeDAO.getEmployee;

@Log4j2
public class StreamApi {
    public static Object moreSalay(){
        return getEmployee().stream().filter(employee -> employee.getSalary()==5000).collect(Collectors.toList());
    }



    public static void main(String[] args) {
        log.info(moreSalay());

    }
}
