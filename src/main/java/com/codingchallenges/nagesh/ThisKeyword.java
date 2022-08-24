package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThisKeyword {
    static {
        log.info("This method is invoked by static keyword");
    }

    static void m1() {
        log.info("This is static m1");
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.acces();
    }

    void acces() {
        this.m2();
        this.m1();

    }

    void m2() {
        log.info("This is static m2");

    }

}
