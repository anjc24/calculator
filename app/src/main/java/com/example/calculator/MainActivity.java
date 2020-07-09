package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button mul;
    Button div;
    Button equal;
    Button clear;
    TextView result;
    TextView info;
    final char Addition = '+';
    final char Subtraction = '-';
    final char Multiplication = 'x';
    final char Division = '/';
    final char Equal = '=';
    double val1 = Double.NaN;
     double val2;
     char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });
       four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = Addition;
                result.setText(String.valueOf(val1) + " + ");
                info.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = Subtraction;
                result.setText(String.valueOf(val1) + " - ");
                info.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = Multiplication;
                result.setText(String.valueOf(val1) + " x ");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = Division;
                result.setText(String.valueOf(val1) + " / ");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = Equal;
                result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length()>0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));

                }else{
                    val1 = Double.NaN;
                    val2= Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });


    }

    public void view(){
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five= (Button)findViewById(R.id.button5);
        six= (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight= (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        zero = (Button)findViewById(R.id.button0);
        equal = (Button)findViewById(R.id.buttonEqual);
        plus = (Button)findViewById(R.id.buttonadd);
        minus = (Button)findViewById(R.id.buttonSub);
        mul = (Button)findViewById(R.id.buttonMul);
        div = (Button)findViewById(R.id.buttondiv);
        equal = (Button)findViewById(R.id.buttonEqual);
        clear = (Button)findViewById(R.id.buttonC);
        info= (TextView)findViewById(R.id.textViewDisplay);
        result=(TextView)findViewById(R.id.textViewResult);
    }

    void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());
            switch (action){
                case Addition:
                    val1 = val1 +val2;
                    break;
                case Subtraction:
                    val1 = val1 - val2;
                    break;
                case Multiplication:
                    val1 = val1*val2;
                    break;
                case Division:
                    val1 = val1/val2;
                    break;
                case Equal:
                    break;

            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}