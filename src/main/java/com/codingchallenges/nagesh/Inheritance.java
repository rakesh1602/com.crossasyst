package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Inheritance {
    void parent() {
        log.info("Parent method called");
    }

}
    @Log4j2
    class Child extends Inheritance {
        void child() {
            log.info("This is child class method");
        }

    }

@Log4j2
    class Third extends Child {

void third(){
    super.parent();
    }

    public static void main(String[] args) {
        Third child= new Third();
        child.child();
        child.parent();
        child.third();

    }
}


