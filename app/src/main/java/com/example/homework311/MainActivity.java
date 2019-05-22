package com.example.homework311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String result = "";
    TextView calc;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPoint;
    Button buttonEq;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMult;
    Button buttonDivide;
    Button buttonC;
    Button buttonPerc;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = (TextView)findViewById(R.id.calc);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonPoint = (Button)findViewById(R.id.buttonPoint);
        buttonEq = (Button)findViewById(R.id.buttonEq);
        buttonPlus = (Button)findViewById(R.id.buttonPlus);
        buttonMinus = (Button)findViewById(R.id.buttonMin);
        buttonMult = (Button)findViewById(R.id.buttonMult);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonPerc = (Button)findViewById(R.id.buttonPerc);
        buttonBack = (Button)findViewById(R.id.buttonBck);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "0");
                result = calc.getText().toString();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "1");
                result = calc.getText().toString();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "2");
                result = calc.getText().toString();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "3");
                result = calc.getText().toString();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "4");
                result = calc.getText().toString();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "5");
                result = calc.getText().toString();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "6");
                result = calc.getText().toString();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "7");
                result = calc.getText().toString();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "8");
                result = calc.getText().toString();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + "9");
                result = calc.getText().toString();
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + ".");
                result = calc.getText().toString();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText("");
                result = calc.getText().toString();
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + " / ");
                result = calc.getText().toString();
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + " * ");
                result = calc.getText().toString();
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + " - ");
                result = calc.getText().toString();
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + " + ");
                result = calc.getText().toString();
            }
        });

        buttonPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText(result + " % ");
                result = calc.getText().toString();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText("Думою как реализовать");
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText("Пока настроен только вывод цифр через какую-то срань, буду переделывать");
                result = calc.getText().toString();
            }
        });
    }
}
