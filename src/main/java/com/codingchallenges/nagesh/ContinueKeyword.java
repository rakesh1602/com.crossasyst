package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ContinueKeyword {

    void checkMultiplication() {
        for(int i=0;i<=50;i++){
            if(i%3==0 && i%5==0){
                if((i%3==0) != (i%5==0)){
                    continue;
                }
                log.info(i);
            }

        }


    }

    public static void main(String[] args) {
        ContinueKeyword continueKeyword=new ContinueKeyword();
        continueKeyword.checkMultiplication();
    }

}
