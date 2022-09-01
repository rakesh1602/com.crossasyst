package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LargestElementofArray {

    void largestElementofArray(){
        int array[]={7,8,5,4,9,10};
        int largest=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        log.info("Largest element is "+largest);
    }

    public static void main(String[] args) {
        LargestElementofArray largestElementofArray=new LargestElementofArray();
        largestElementofArray.largestElementofArray();
    }
}
