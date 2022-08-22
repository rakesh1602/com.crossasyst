package com.java8Features;

//LF=> The expession through which we can represent anonymous function.
//Anonymous function a method who dont have any name or modifier.
//Parameter () EXPRESSION -> BODY SOUT()
//Functional interface - interface with only one abstarct method
//eg- Runnable -- run()

import lombok.extern.log4j.Log4j2;

interface Calulator{
    //void SwitchON();

    //void sum(int input);

    int substract(int i1, int i2);
}
@Log4j2
public class CalculatorIMP1 {

/* Normal method - by implementing interface  method
    @Override
    public void SwitchON() {
        log.info("Switch on");
    }
*/
public static void main(String[] args) {
    /*Calulator calulator=()->
            log.info("Switch on");
    calulator.SwitchON();*/

    /*Calulator calulator=(input)-> log.info("sum :"+input);
    calulator.sum(33);
*/
    Calulator calulator=(i1, i2)-> {
        //return i1 - i2;
        if (i1 < i2) {
            throw new RuntimeException("minus  not alloed");
        } else {
            return i1 - i2;
        }

    };
    log.info(calulator.substract(23, 33));


}
}
