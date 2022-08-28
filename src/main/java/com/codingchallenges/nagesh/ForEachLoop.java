package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ForEachLoop {
    public static void main(String[] args) {
        int a[] = {22, 55, 43};
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        log.info("Sum of all the element is " + sum);
    }
}
