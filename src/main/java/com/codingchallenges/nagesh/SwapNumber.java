package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

public class SwapNumber {

    public int chekswap(){
        int temp;
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=15;

        temp=a;
        a=b;
        b=temp;

        return b;
    }
}
