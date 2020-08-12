package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button btn;
    String myString = "Sending Data";
    protected EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById((R.id.button));
        editText1 = findViewById(R.id.editTextNumber1);
        editText2 = findViewById(R.id.editTextNumber2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("Num1", number1);
                intent.putExtra("Num2", number2);

                Toast toast = Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);

            }
        });
    }

}