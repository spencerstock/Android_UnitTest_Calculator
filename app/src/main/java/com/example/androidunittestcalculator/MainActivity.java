package com.example.androidunittestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView display;
    Button button_num_1;
    Button button_num_2;
    Button button_num_3;
    Button button_num_4;
    Button button_num_5;
    Button button_num_6;
    Button button_num_7;
    Button button_num_8;
    Button button_num_9;
    Button button_plus;
    Button button_minus;
    Button button_multiply;
    Button button_divide;
    Button button_equals;
    Button button_decimal;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        display = findViewById(R.id.text_display);
        button_num_1 = findViewById(R.id.button_num_one);
        button_num_2 = findViewById(R.id.button_num_two);
        button_num_3 = findViewById(R.id.button_num_three);
        button_num_4 = findViewById(R.id.button_num_four);
        button_num_5 = findViewById(R.id.button_num_five);
        button_num_6 = findViewById(R.id.button_num_six);
        button_num_7 = findViewById(R.id.button_num_seven);
        button_num_8 = findViewById(R.id.button_num_eight);
        button_num_9 = findViewById(R.id.button_num_nine);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_multiply = findViewById(R.id.button_multiply);
        button_divide = findViewById(R.id.button_divide);
        button_equals = findViewById(R.id.button_equals);
        button_decimal = findViewById(R.id.button_decimal);


        button_num_1.setOnClickListener(this);
        button_num_2.setOnClickListener(this);
        button_num_3.setOnClickListener(this);
        button_num_4.setOnClickListener(this);
        button_num_5.setOnClickListener(this);
        button_num_6.setOnClickListener(this);
        button_num_7.setOnClickListener(this);
        button_num_8.setOnClickListener(this);
        button_num_9.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_equals.setOnClickListener(this);
        button_decimal.setOnClickListener(this);
    }

    private void updateDisplay() {
        display.setText(calculator.getDisplayString());
    }

    @Override
    public void onClick(View v) {
        String symbol = ((Button)v).getText().toString();
        if (symbol.equals("=")) calculator.runCalculation();
        else calculator.addSymbol(symbol);
        updateDisplay();
    }
}
