package com.example.androidunittestcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorUnitTest {

    @Test
    public void addSymbol_ReturnsString() {
        assertEquals("Test", Calculator.addSymbol("Test"));

    }

    @Test
    public void addSymbol_ReturnsMultipleStrings() {
        assertEquals("Test2", Calculator.addSymbol("Test2"));
        assertEquals("Test3", Calculator.addSymbol("Test3"));

    }
}
