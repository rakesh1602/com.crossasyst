package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
@Log4j2
public class RemoveRangeMethod extends ArrayList<Integer> {
    public static void main(String[] args) {
        RemoveRangeMethod removeRangeMethod=new RemoveRangeMethod();
        for(int i=0;i<=10;i++){
            removeRangeMethod.add(10*i);
        }
        log.info(removeRangeMethod);
      removeRangeMethod.removeRange(0,3);
      log.info("Removing Range "+removeRangeMethod);

    }

}
