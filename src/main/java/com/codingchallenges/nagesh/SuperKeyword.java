package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SuperKeyword {
    void firstMethod() {
        log.info("This is parent class method");
    }
}

@Log4j2
class Child1 extends SuperKeyword{
    void childMethod(){
        super.firstMethod();
        log.info("This is second method called in child class");
    }

    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.childMethod();
    }
}



