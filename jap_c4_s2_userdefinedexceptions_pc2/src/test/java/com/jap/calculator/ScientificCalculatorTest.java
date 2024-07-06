package com.jap.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScientificCalculatorTest {

    ScientificCalculator sc;

    @BeforeEach
    void setUp()
    {
        sc = new ScientificCalculator();
    }
    @AfterEach
    void tearDown()
    {
        sc = null;
    }


    @Test
    public void givenANumberReturnResult() throws CalculatorException {
        double cielResult = sc.cielOfANumber(4);
        assertEquals(4.0,cielResult);
        double floorResult = sc.floorOfANumber(4.5f);
        assertEquals(4.0,floorResult);
        double squareRootResult = sc.squareRoot(4);
        assertEquals(2,squareRootResult);
        long powerResult = sc.power(4,2);
        assertEquals(16,powerResult);
    }

    @Test
    public void givenANegativeNumberThrowException() throws CalculatorException {
        assertThrows(CalculatorException.class,()->sc.cielOfANumber(-4));
        assertThrows(CalculatorException.class,()->sc.floorOfANumber(-4.5f));
        assertThrows(CalculatorException.class,()->sc.squareRoot(-9));
        assertThrows(CalculatorException.class,()->sc.power(4,-2));
    }

    @Test
    public void givenZeroThrowException() throws CalculatorException {
        assertThrows(CalculatorException.class,()->sc.cielOfANumber(0));
        assertThrows(CalculatorException.class,()->sc.floorOfANumber(0.0f));
        assertThrows(CalculatorException.class,()->sc.squareRoot(0));
        assertThrows(CalculatorException.class,()->sc.power(0,-2));
    }
}
