package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity {
    Button btn;
    Button btn1;
    EditText textview11;
    EditText editText11;
    EditText editText12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        btn1=(Button) findViewById(R.id.btn4);
        btn = (Button) findViewById(R.id.button3);
        textview11 = (EditText) findViewById(R.id.editTextNumber3);
        editText11 = (EditText) findViewById(R.id.editTextNumber);
        editText12 = (EditText) findViewById(R.id.editTextNumber2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editText11.getText().toString();
                int a = Integer.parseInt(value1);
                String value2 = editText12.getText().toString();
                int b = Integer.parseInt(value2);
                int sum = a + b;
                textview11.setText("Sum Result: " + Integer.toString(sum));


                Toast.makeText(getApplicationContext(), "Sum : " + String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview11.setText(" ");
                editText12.setText(" ");
                editText11.setText(" ");

            }
        });
    }
}
