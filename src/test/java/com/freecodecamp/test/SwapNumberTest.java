package com.freecodecamp.test;

import com.codingchallenges.nagesh.SwapNumber;
import junit.framework.TestCase;
import org.junit.Test;


public class SwapNumberTest extends TestCase {
    @Test
    public void testMain() {
        SwapNumber sn = new SwapNumber();

        assertEquals(15,sn.chekswap());


    }
}
