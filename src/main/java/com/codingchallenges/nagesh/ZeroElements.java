package com.codingchallenges.nagesh;

public class ZeroElements {
    void zeroElemets() {
        int array[] = {1, 2, 3, 0, 2, 0, 0, 4, 6, 0};
        for (int i=0;i< array.length;i++){
            for (int j=1;j< array.length;j++){
                if(array[i]==0){
                    array[i]=array[j];
                }
            }
        }

    }
}
