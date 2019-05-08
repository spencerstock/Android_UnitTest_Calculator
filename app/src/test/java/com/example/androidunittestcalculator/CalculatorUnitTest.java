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
        Calculator calculator = new Calculator();
        ;
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

    @Test
    public void backPressNormal_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.backPress();
        assertEquals("52", calculator.addSymbol("2"));
    }

    @Test
    public void backPressEmptyField_ReturnsString() {
        Calculator calculator = new Calculator();
        calculator.backPress();
        assertEquals("0", calculator.getDisplayString());
    }

    @Test
    public void backPressEmptyFieldAfterOperator_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.addSymbol("/");
        calculator.backPress();
        assertEquals("0", calculator.getDisplayString());
    }

    @Test
    public void runBasicCalculation_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.addSymbol("+");
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.runCalculation();
        assertEquals("112", calculator.getDisplayString());
    }

    @Test
    public void runEmptyCalculation_ReturnsString() {
        Calculator calculator = new Calculator();
        calculator.runCalculation();
        assertEquals("5", calculator.addSymbol("5"));
    }

    @Test
    public void runDoubleCalculation_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.addSymbol("+");
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.runCalculation();
        calculator.addSymbol("+");
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("50", calculator.addSymbol("0"));
        assertEquals("162", calculator.getDisplayString());
    }


    @Test
    public void runDoubleCalculationWithoutRunCalculate_ReturnsString() {
        Calculator calculator = new Calculator();
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.addSymbol("+");
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("56", calculator.addSymbol("6"));
        calculator.addSymbol("+");
        assertEquals("5", calculator.addSymbol("5"));
        assertEquals("50", calculator.addSymbol("0"));
        calculator.addSymbol("+");
        assertEquals("162", calculator.getDisplayString());
    }

}
