package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class NestedIfElse {
    void nestedifelse() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 != 0){
            log.info("Hello");
        } else if (x %2==0){
            if(x>0 && x<10){
                log.info("hi");
            } if(x>10 && x<20){
                log.info("Hello");
            } else if (x>20){
                log.info("Bye");
            }
        }
    }

    public static void main(String[] args) {
       NestedIfElse ns=new NestedIfElse();
       ns.nestedifelse();
    }
}
