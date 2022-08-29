package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
public class RemovingElements {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(20);
        arrayList.add(2);
        arrayList.add(10);

      log.info(arrayList.remove(arrayList.size()-2));
      log.info(arrayList);




    }


}
