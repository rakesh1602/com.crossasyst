package com.java8Features;

import lombok.extern.log4j.Log4j2;

interface Phone {
    void call();
    default void message(){
        System.out.println("Message Sended");
    }
}
@Log4j2
class AndroidPhone implements Phone{

    @Override
    public void call() {
        log.info("Phone is calling");
    }

    public static void main(String[] args) {
        Phone phone=new AndroidPhone();
        phone.call();
        phone.message();
    }
}
