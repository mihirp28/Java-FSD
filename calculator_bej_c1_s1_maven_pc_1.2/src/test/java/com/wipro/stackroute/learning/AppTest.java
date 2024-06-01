package com.wipro.stackroute.learning;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class AppTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }


    @Test
    public void add() {
        assertEquals(2, calc.add(1, 1), 0);
        assertEquals(1.42, calc.add(3.14, -1.72), 0.001);
        assertEquals(2.0/3, calc.add(1.0/3, 1.0/3), 0.001);
    }

    @Test
    public void sub() {
        assertEquals(0, calc.sub(1, 1), 0);
        assertEquals(4.86, calc.sub(3.14, -1.72), 0.001);
        assertEquals(2.0/3, calc.sub(1.0/3, -1.0/3), 0.001);
    }

    @Test
    public void mul() {
        assertEquals(2, calc.mul(1, 2), 0);
        assertEquals(-5.4008, calc.mul(3.14, -1.72), 0.001);
        assertEquals(0.111, calc.mul(1.0/3, 1.0/3), 0.001);
    }

    @Test
    public void div() {
        assertEquals(2, calc.div(4, 2), 0);
        assertEquals(-1.826, calc.div(3.14, -1.72), 0.001);
        assertEquals(1, calc.div(1.0/3, 1.0/3), 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void divException() {
        calc.div(2, 0);
    }
}


