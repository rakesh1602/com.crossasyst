package com.java8Features;

import lombok.extern.log4j.Log4j2;

interface A{
    void show(int i);
}
@Log4j2
/*class Xyz implements A{

    @Override
    public void show() {
        log.info("Hello");
    }
}*/
public class Lambda {
    public static void main(String[] args) {
        A obj;
        obj =(i) -> log.info("Hello "+i);
        obj.show(7);
    }



}
