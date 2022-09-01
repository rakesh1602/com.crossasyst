package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@Log4j2
public class ConsumerInterfaceDemo {


   /*
   Done by implementing Cosumer Intertface
   @Override
    public void accept(Integer integer) {
        log.info("Consumer "+integer);
    }

    public static void main(String[] args) {
        ConsumerInterfaceDemo consumerInterfaceDemo=new ConsumerInterfaceDemo();
        consumerInterfaceDemo.accept(10);


    }*/

    public static void main(String[] args) {
        Consumer <String> consumer = t -> log.info("Rakesh "+t);
        consumer.accept("Rakesh with lambda");

        List<Integer> list= Arrays.asList(2, 3, 54, 3);
        list.stream().forEach(t -> log.info("Rakesh "+t));
    }
}
