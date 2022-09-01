package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

import java.util.function.Predicate;

@Log4j2
public class PredicateInterfaceDemo {
   /* By Overdidng method
   @Override
    public boolean test(Integer integer) {
        if(integer %2==0){
           return true;
        }
        return false;
    }*/

    public static void main(String[] args) {
       /*PredicateInterfaceDemo predicateInterfaceDemo=new PredicateInterfaceDemo();
       log.info(predicateInterfaceDemo.test(10));*/

        Predicate<Integer> predicate = integer -> {
            if(integer %2==0){
                return true;
            }
            return false;
        };
       log.info(predicate.test(19));
    }
}
