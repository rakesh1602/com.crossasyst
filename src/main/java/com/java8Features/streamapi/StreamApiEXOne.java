package com.java8Features.streamapi;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class StreamApiEXOne {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rakesh", "Rajesh", "Arun", "Babita");
       /* for(String i:list){
        if(i.startsWith("R"){
            log.info(list);
        }*/

        list.stream().filter(t->t.startsWith("R")).forEach(t->log.info(t));

        //list.stream().forEach(t->log.info(t));

       /* Map<Integer, String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"B");


        map.entrySet().stream().forEach(obj->log.info(obj));*/

    }
}
