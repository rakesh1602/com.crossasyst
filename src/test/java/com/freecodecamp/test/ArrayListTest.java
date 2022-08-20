package com.freecodecamp.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    private final int INITIAL_CAPACITY=5;

    @Test
    public void shouldDemonstrateArrayList(){
        List<String> elements=new ArrayList<>(INITIAL_CAPACITY);
        elements.add("A");
        elements.add("B");
        elements.add("C");
        elements.add("A");
        elements.add(2, "new added");

        elements.remove("A");
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());


        System.out.println(elements.indexOf("B"));





    }
}
