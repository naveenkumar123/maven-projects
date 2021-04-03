package com.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAdd() {
    	assertEquals(2, new Calculator().add(1,1));
    }
    
    @Test
    public void testSub() {
    	assertEquals(1, new Calculator().substract(2,1));
    }
}
