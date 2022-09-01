package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Scanner;

@Log4j2
public class ReadArrayElements {
    public static void main(String[] args) {
        int array[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< array.length;i++) {
            array[i] = sc.nextInt();
        }
        display(array);
    }
    static void display(int arr[]){
        log.info(Arrays.toString(arr));
    }
}
