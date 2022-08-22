package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.util.Random;
@Log4j2
public class RandomNumber {
    void randomNumber(){
        Random r=new Random();
        for(int i=0;i<5;i++){
            int x=r.nextInt(1000);
            log.info(x);
        }
    }

    public static void main(String[] args) {
        RandomNumber r=new RandomNumber();
        r.randomNumber();

    }
}
