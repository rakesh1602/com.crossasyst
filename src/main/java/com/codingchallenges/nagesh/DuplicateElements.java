package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class DuplicateElements {
    void checkDeuplicateElements() {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];
        int count = 0;
        System.err.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array.length; j++) {
                if (array[k] == array[j]) {
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
                log.info("Array contain duplicate elements");
            }
        }
    }


    public static void main(String[] args) {
    DuplicateElements duplicateElements=new DuplicateElements();
    duplicateElements.checkDeuplicateElements();
    }
}
