package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PairofArrayElements {
    void getpair(){
        int array[]={2,8,3,4,5,5,1,7};
        for(int i=0;i<array.length;i++){
            for(int j=1;j< array.length;j++){
                if((array[i]+array[j])==10){
                    log.info("Pair of elements is "+array[i]+" " +array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        PairofArrayElements pairofArrayElements=new PairofArrayElements();
        pairofArrayElements.getpair();
    }
}
