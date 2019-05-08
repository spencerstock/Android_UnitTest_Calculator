package com.example.androidunittestcalculator;

import java.util.regex.Pattern;

public class Calculator {

    private String  displayString = "0";
    private Pattern NUMERICAL     = Pattern.compile("[0-9]");
    private Pattern OPERANDS      = Pattern.compile("[?:/*+%\\-]");
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


    private void addNumber(String symbol) {
        if (displayString.equals("0")) displayString = symbol;
        else displayString += symbol;
    }

    private void addDecimal(String symbol) {
        if (!displayString.contains(".")) displayString += symbol;
    }

    private void addOperator(String symbol) {
        if (operator == '\0') {
            char[] temp = symbol.toCharArray();
            operator = temp[0];
            operand1 = Float.valueOf(displayString);
            displayString = "0";
        }

    }

    public void backPress() {

        if (displayString.length() == 1) displayString = "0";
        else displayString = displayString.substring(0,displayString.length()-1);
    }

    public String getDisplayString() {
        return displayString;
    }

    char getOperator() {
        return operator;
    }
}
