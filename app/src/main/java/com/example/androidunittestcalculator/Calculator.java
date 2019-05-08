package com.example.androidunittestcalculator;

import java.util.regex.Pattern;

public class Calculator {

    private String  displayString = "";
    private Pattern NUMERICAL     = Pattern.compile("[0-9]");
    private Pattern OPERANDS      = Pattern.compile("[?:/*+\\-]");
    private float   operand1;
    private float   operand2;
    private char    operator;

    public Calculator() {
    }

    public String addSymbol(String symbol) {

        if (symbol.length() != 1) return null;
        if (NUMERICAL.matcher(symbol).matches())
            addNumber(symbol);


        if (symbol.equals("."))
            addDecimal(symbol);

        if (OPERANDS.matcher(symbol).matches()) addOperator(symbol);

        return displayString;

    }

    private void addOperator(String symbol) {
        if (operator == '\0') {
            char[] temp = symbol.toCharArray();
            operator = temp[0];
            operand1 = Float.valueOf(displayString);
            displayString = "";
        }

    }


    private String addNumber(String symbol) {
        displayString += symbol;
        return symbol;
    }

    private String addDecimal(String symbol) {
        if (displayString.contains(".")) return null;
        displayString += symbol;
        return symbol;
    }

    public char getOperator() {
        return operator;
    }
}