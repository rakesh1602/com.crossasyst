package com.freecodecamp.test;

import com.sun.jdi.request.InvalidRequestStateException;

public class CarSelector {
    public static void main(String[] args) {
        CarService carService=new CarService();
        for(String argument: args){
           if (isvalid(argument)) {
              // carService.process(argument);
           } else{
               System.out.println("unknown error");
           }
        }
    }

    private static boolean isvalid(String argument)  {
        try {
            CarState carState = CarState.valueOf(argument);
        } catch(IllegalArgumentException e){
            return false;
        }

        return true;
    }
}
