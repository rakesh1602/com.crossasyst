package com.java8Features.JavaTechie;

import lombok.extern.log4j.Log4j2;

interface Calculator{
    void switchon();

}
//Normal Method
@Log4j2
/*class NormalMethod implements Calculator{

    @Override
    public void switchon() {
        log.info("Normal method Switch on");
    }
}*/

public class LambdaCalculator {
    public static void main(String[] args) {
        /*NormalMethod nm=new NormalMethod();
        nm.switchon();*/

        //Lambda
        Calculator calculator= () -> log.info("Lambda function");
        calculator.switchon();
    }




}
