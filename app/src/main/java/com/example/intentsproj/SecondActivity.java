package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1,num2, ans;
    String String1, String2;
    int Number1, Number2,Number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = (TextView) findViewById(R.id.editTextNumber3);
        num2 = (TextView) findViewById(R.id.editTextNumber4);
        ans = (TextView) findViewById(R.id.txtans);

        num1.setText(getIntent().getStringExtra("Num1"));
        num2.setText(getIntent().getStringExtra("Num2"));

        String1 = num1.getText().toString();
        String2 = num2.getText().toString();

        Number1 = Integer.parseInt(String1);
        Number2 = Integer.parseInt(String2);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number3 = Number1 + Number2;
                ans.setText(Number1 + " + " +Number2+" = "+ Number3);
        }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Number1>Number2){
                    Number3 = Number1 - Number2;
                    ans.setText(Number1 + " - " +Number2+" = "+ Number3);
                }else{
                    Number3 = Number2 - Number1;
                    ans.setText(Number2 + " - " +Number1+" = "+ Number3);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number3 = Number1 / Number2;
                ans.setText(Number1 + " / " +Number2+" = "+ Number3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number3 = Number1 * Number2;
                ans.setText(Number1 + " * " +Number2+" = "+ Number3);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}