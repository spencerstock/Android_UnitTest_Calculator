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
    public void addZeroAfterDecimal_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("56.", calculator.addSymbol("."));
        assertEquals("56.0", calculator.addSymbol("0"));
        assertEquals("56.00", calculator.addSymbol("0"));
        assertEquals("56.001", calculator.addSymbol("1"));
    }

    @Test
    public void addZeroAfterDecimalNoInteger_ReturnsString() {
        Calculator calculator = new Calculator();;
        assertEquals("0.", calculator.addSymbol("."));
        assertEquals("0.0", calculator.addSymbol("0"));
        assertEquals("0.00", calculator.addSymbol("0"));
        assertEquals("0.001", calculator.addSymbol("1"));
    }

    @Test
    public void addZeroBeforeNumbers_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("0", calculator.addSymbol("0"));
        assertEquals("6", calculator.addSymbol("6"));
    }

    @Test
    public void addMultipleDecimals_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertEquals("0.", calculator.addSymbol("."));
        assertEquals("0.", calculator.addSymbol("."));
        assertEquals("0.1", calculator.addSymbol("1"));
    }

    @Test
    public void addMultipleSymbols_ReturnsNull() {
        Calculator calculator = new Calculator();
        assertNull(calculator.addSymbol("123"));
    }

    @Test
    public void addMinusSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("0", calculator.addSymbol("-"));
        assertEquals('-', calculator.getOperator());
    }

    @Test
    public void addPlusSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("0", calculator.addSymbol("+"));
        assertEquals('+', calculator.getOperator());
    }

    @Test
    public void addMultiplySymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("0", calculator.addSymbol("*"));
        assertEquals('*', calculator.getOperator());
    }

    @Test
    public void addDivideSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("0", calculator.addSymbol("/"));
        assertEquals('/', calculator.getOperator());
    }

    @Test
    public void addModulusSymbol_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        assertEquals("0", calculator.addSymbol("%"));
        assertEquals('%', calculator.getOperator());
    }



}
