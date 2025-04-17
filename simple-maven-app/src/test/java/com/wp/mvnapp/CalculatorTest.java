package com.wp.mvnapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		
		assertEquals(25, calc.add(10, 15));
		
	}

}
