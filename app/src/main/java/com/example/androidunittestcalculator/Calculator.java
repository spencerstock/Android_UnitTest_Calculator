package com.example.androidunittestcalculator;

public class Calculator {

    private static String savedSymbol;

    public static String addSymbol(String symbol) { //saves string

        if (savedSymbol == null) {
            savedSymbol = symbol;
        }
        return savedSymbol;

    }
}
