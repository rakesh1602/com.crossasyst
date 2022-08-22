package com.codingchallenges.nagesh;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConstructorChainning {
    ConstructorChainning() {
        this(5);
        log.info("This is default constructor");
    }

    ConstructorChainning(int x) {
        this(5, 15);
        log.info(x);
    }
    ConstructorChainning(int x, int y){
       log.info(x * y);
    }

    public static void main(String[] args) {
        new ConstructorChainning();
    }

}