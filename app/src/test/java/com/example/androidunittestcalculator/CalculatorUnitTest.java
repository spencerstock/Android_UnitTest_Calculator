package com.example.androidunittestcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CalculatorUnitTest {

    @Test
    public void addSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
    }

    @Test
    public void addMultipleSymbols_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("56.", calculator.addSymbol("."));
    }

    @Test
    public void addMultipleDecimals_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertEquals(".", calculator.addSymbol("."));
        assertEquals(".", calculator.addSymbol("."));
        assertEquals(".1", calculator.addSymbol("1"));
    }

    @Test
    public void addMultipleSymbols_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertNull(calculator.addSymbol("123"));
    }

    @Test
    public void addMinusSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals(".", calculator.addSymbol("."));
        assertEquals(".1", calculator.addSymbol("1"));
        assertEquals("", calculator.addSymbol("-"));
        assertEquals('-', calculator.getOperator());

    }

}
