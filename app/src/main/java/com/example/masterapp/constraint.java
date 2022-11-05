package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class constraint extends AppCompatActivity {

    Button btn1 , btn2;
    EditText et1 , et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = et1.getText().toString();
                String val2 = et2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a+b;
                Toast.makeText(getApplicationContext(), "Sum is"+String.valueOf(sum), Toast.LENGTH_SHORT).show();
                tv1.setText("Sum ="+Integer.toString(sum));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(" ");
                et2.setText(" ");
                tv1.setText(" ");

            }
        });
    }
}
