package org.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAaaTest {

    private Calculator calc;

    @Before
    public void setUp() {
        // Arrange (common setup before each test)
        calc = new Calculator();
        System.out.println("Setup before test.");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Cleanup after test.");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(7, 3);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(10, 6);
        assertEquals(60, result);
    }
}
