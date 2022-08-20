package com.freecodecamp.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest{
    @Test
    public void shouldReturnHelloWorld(){
        Person rakesh=new Person();
        assertEquals("Hello World", rakesh.helloworld());
    }

    @Test
    public void shouldReturnHelloRakesh() {
        Person person = new Person();
        //assertEquals("Hello Rakesh",person.hello("Rakesh"));
    }

    @Test
    public void shouldReturnNumberofPerson(){
        Person person1=new Person();
        Person person2=new Person();
        Person myPerson=new Person();

        assertEquals(3,myPerson.numberofPerson());
    }

    @Test
    public void demonstrateBoolean(){}

    @Test
    public void demonstrateArrays() {
        Person[] person = new Person[4];
        person[0] = new Person();
        person[1] = new Person();
        person[2] = new Person();
        person[3] = new Person();

        Person myPerson = new Person();
        myPerson = person[2];

        Person[] person1 = {person[0], myPerson};
    }
        @Test
        public void shouldCloneArray(){
            int [] array={1,2,3,};
            int[] copiearray=array.clone();
            assertSame(array, array);
            assertNotSame(array, copiearray);
        }

}