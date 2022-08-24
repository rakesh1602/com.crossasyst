package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class IntegerConverging  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        String x=sc.next();
        String y=sc.next();
        try{
            int n1=Integer.parseInt(x);
            int n2=Integer.parseInt(y);
            int z=n1+n2;
            log.info("Total is "+z);
        } catch (Exception e) {
            log.info("Only number values are allowed");
        }
    }
}
