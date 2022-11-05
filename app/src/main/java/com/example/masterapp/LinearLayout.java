package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LinearLayout extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        e1=(EditText)findViewById(R.id.editTextTextPersonName3);
        e2=(EditText)findViewById(R.id.editTextTextPersonName4);
        t1=(TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = e1.getText().toString();
                String val2 = e2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a+b;
                Toast.makeText(getApplicationContext(), "Sum is "+String.valueOf(sum), Toast.LENGTH_SHORT).show();
                t1.setText("sum="+Integer.toString(sum));


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(" ");
                e2.setText(" ");
                t1.setText(" ");
            }
        });
    }
}
