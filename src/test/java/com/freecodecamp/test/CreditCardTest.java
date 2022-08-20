package com.freecodecamp.test;

import com.codingchallenges.nagesh.CreditCard;
import junit.framework.TestCase;
import org.junit.Test;

public class CreditCardTest extends TestCase {
   @Test
    public void testCheckCreditCard() {
       CreditCard cd=new CreditCard();
       assertEquals("visa", cd.checkCreditCard("5"));
    }
}