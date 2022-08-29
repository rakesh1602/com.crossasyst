package com.freecodecamp.test;


public class Person {

    private static final int PENDING=43;
    private static final int PROCESSING=43;



    //private Name personName;
    private int personcounter;



    public Person(){
        personcounter++;
    }

    public static Person numberofPerson() {
        return new Person();
    }

    public String helloworld() {
        return "Hello World";

    }

    /*public Name name() {
        return personName;
    }
*/
/* public String hello() {
        Name n = new Name();
        n.personName();

        //return "Hello" +n.personName();
    }*/





    }



