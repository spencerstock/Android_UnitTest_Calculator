package com.example.androidunittestcalculator;

import java.util.regex.Pattern;

public class Calculator {

    private String  displayString = "";
    private Pattern NUMERICAL     = Pattern.compile("[0-9]");
    private float   operand1;
    private float   operand2;
    private char    operator;

    public Calculator() {
    }

    public String addSymbol(String symbol) { //saves string

        if (symbol.length() != 1) return null;
        if (NUMERICAL.matcher(symbol).matches()) addNumber(symbol);


        if (symbol.equals(".")) {
            addDecimal(symbol);
        }


        return displayString;

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
}
