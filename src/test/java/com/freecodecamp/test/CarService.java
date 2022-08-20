package com.freecodecamp.test;


import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class CarService {

  /* private static final Logger log=Logger.getLogger(String.valueOf(CarService.class));
    public void process(String input){
        log.info("processing car:"+input);
    }*/

    public void drive(){
        BMW bmw=new BMW();
        bmw.drive();
    }

}
