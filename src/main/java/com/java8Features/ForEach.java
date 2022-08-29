package com.java8Features;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Log4j2
public class ForEach {

    public static void main(String[] args) {
        List<Integer>values= Arrays.asList(4,5,6,8);
        values.forEach(i -> log.info(i));
    }
}
