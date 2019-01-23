package com.cse.nayanraj.calculator_simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private EditText Num1;
    private EditText Num2;
    private TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add = (Button)findViewById(R.id.BtnAdd);
        Sub =(Button)findViewById(R.id.BtnSub);
        Mul = (Button)findViewById(R.id.BtnMul);
        Div =(Button)findViewById(R.id.BtnDiv);
        Num1 = (EditText) findViewById(R.id.Num1);
        Num2 =(EditText) findViewById(R.id.Num2);
        Result =(TextView)findViewById(R.id.Result);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number_1 = Integer.parseInt(Num1.getText().toString());
                int Number_2 = Integer.parseInt(Num2.getText().toString());
                int Sum = Number_1+ Number_2;
                Result.setText(String.valueOf(Sum));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number_1 = Integer.parseInt(Num1.getText().toString());
                int Number_2 = Integer.parseInt(Num2.getText().toString());
                int Sub = Number_1-Number_2;
                Result.setText(String.valueOf(Sub));
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number_1 = Integer.parseInt(Num1.getText().toString());
                int Number_2 = Integer.parseInt(Num2.getText().toString());
                int Multi = Number_1*Number_2;
                Result.setText(String.valueOf(Multi));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number_1 = Integer.parseInt(Num1.getText().toString());
                int Number_2 = Integer.parseInt(Num2.getText().toString());
                int Divi= Number_1/Number_2;
                Result.setText(String.valueOf(Divi));
            }
        });

    }
}
