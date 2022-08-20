package com.codingchallenges.nagesh;

public class CreditCard {
    public String checkCreditCard(String Number){
        char ch=Number.charAt(0);

        if(ch=='4'){
            return "visa";
        } else if (ch==5){
            return "master";
        } else {
            return "wrong input";
        }



    }

}
