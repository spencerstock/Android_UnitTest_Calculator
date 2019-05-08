package com.example.androidunittestcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CalculatorUnitTest {

    @Test
    public void addSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("a", calculator.addSymbol("a"));
    }

    @Test
    public void addMultipleSymbols_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("a", calculator.addSymbol("a"));
        assertEquals("ab", calculator.addSymbol("b"));
        assertEquals("ab.", calculator.addSymbol("."));
    }

    @Test
    public void addMultipleDecimals_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertEquals(".", calculator.addSymbol("."));
        assertNull(calculator.addSymbol("."));
        assertEquals(".c", calculator.addSymbol("c"));
    }

    @Test
    public void addMultipleSymbols_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertNull(calculator.addSymbol("abc"));
    }
}
