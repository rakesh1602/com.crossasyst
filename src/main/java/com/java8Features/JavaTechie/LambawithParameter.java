package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

interface LambaParameter {
    //void sum(int input);
    int substraction(int i1, int i2);
}

@Log4j2
public class LambawithParameter {
    public static void main(String[] args) {
        /*LambaParameter sum1 = (input) -> log.info("Sum "+input);
        sum1.sum(33);*/
        LambaParameter lambaParameter = ((i1, i2) -> i2 - i1);
        log.info(lambaParameter.substraction(45, 22));


    }

}
