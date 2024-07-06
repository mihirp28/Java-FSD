package com.jap.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathematicalCalculatorTest {
    MathematicalCalculator mc;

    @BeforeEach
    void setUp()
    {
        mc = new MathematicalCalculator();
    }
    @AfterEach
    void tearDown()
    {
        mc = null;
    }

    @Test
    public void givenTwoPositiveNumbersThenReturnResult()
    {
        double addResult = mc.add(15,17);
        double subResult = mc.subtract(37,7);
        double mulResult = mc.multiply(8,5);
        double divResult = mc.divide(30,6);
        assertEquals(32,addResult);
        assertEquals(30,subResult);
        assertEquals(40,mulResult);
        assertEquals(5,divResult);

    }

    @Test
    public void givenTwoNegativeNumbersThenReturnResult()
    {
        double addResult = mc.add(-15,17);
        double subResult = mc.subtract(37,-7);
        double mulResult = mc.multiply(8,-5);
        double divResult = mc.divide(30,-6);
        assertEquals(2,addResult);
        assertEquals(44,subResult);
        assertEquals(-40,mulResult);
        assertEquals(-5,divResult);
    }

    @Test
    public void givenZeroAsOneNumberThenReturnException()
    {
        assertEquals(0, mc.divide(30,0));
    }
}
