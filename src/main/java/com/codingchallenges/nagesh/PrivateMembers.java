package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrivateMembers {
    private String name = "Rakesh";
    private int age = 24;
    private String birthdate = "16/02/1999";

    private void PrivateMembers() {
        log.info(name + age + birthdate);
    }


    public static void main(String[] args) {
      PrivateMembers privateMembers=new PrivateMembers();
      privateMembers.PrivateMembers();
    }

}

