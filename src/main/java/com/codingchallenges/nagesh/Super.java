package com.codingchallenges.nagesh;

import java.util.Scanner;

public class Super {
    Scanner sc=new Scanner(System.in);

    void parent(){
         int a;
        System.out.println("Enter a value");
        a=sc.nextInt();
        System.out.println("This is parent class "+a);
    }
}
 class child extends Super{
    void child(){
        super.parent();
        int b;
        System.out.println("Enter b value");
        b=sc.nextInt();
        System.out.println("This is child class "+b);
    }

     public static void main(String[] args) {
         child child=new child();
         child.child();
     }
 }
