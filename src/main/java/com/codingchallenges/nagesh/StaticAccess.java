package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StaticAccess {
    static StaticAccess a;
    static {
        log.info("This is first static method");
        a= new StaticAccess();
        a.fun();
        System.out.println();
    }

    void fun(){
     log.info("This is a fun method");
    }

    public static void main(String[] args) {
        StaticAccess staticAccess=new StaticAccess();
        staticAccess.fun();
    }
}
