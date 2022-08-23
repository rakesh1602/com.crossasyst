package com.freecodecamp.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparePract {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(12);
        values.add(13);
        values.add(16);
        Collections.sort(values,(s1,s2)->{
             if(s1>s2)
                 return 1;
             return -1;
        });
    }


}
