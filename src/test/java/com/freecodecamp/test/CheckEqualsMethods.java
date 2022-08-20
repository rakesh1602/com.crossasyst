package com.freecodecamp.test;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEqualsMethods {
    @Test
    public void primativeshouldbeEual(){
        int i=4;
        int j=4;
        assertTrue(i==j);


    }
}
