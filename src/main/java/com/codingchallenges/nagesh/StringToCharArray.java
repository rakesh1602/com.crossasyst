package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class StringToCharArray {
    void stringToChar() {
        Scanner scanner=new Scanner(System.in);
        String string= scanner.next();
        char ch[]=string.toCharArray();
        int count=0;
        for(int i = 0; i<=ch.length; i++){
            if(ch[i]>=48 && ch[i]<=57){
                System.out.println("String contains digits");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("String contains alphabate");
        }

    }

    public static void main(String[] args) {
        StringToCharArray stringToCharArray=new StringToCharArray();
        stringToCharArray.stringToChar();
    }
    }
