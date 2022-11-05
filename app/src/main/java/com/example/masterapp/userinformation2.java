package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class userinformation2 extends AppCompatActivity {
    TextView txtviw ,txtviw2 , txtviw3;
    Button bkbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinformation2);
        txtviw=(TextView)findViewById(R.id.txtviw);
        txtviw2=(TextView)findViewById(R.id.txtviw2);
        txtviw3=(TextView)findViewById(R.id.txtviw3);
        bkbtn=(Button) findViewById(R.id.bkbtn);
        Intent third = getIntent();
        String msg1 = third.getStringExtra("Text1");
        String msg2 = third.getStringExtra("Text2");
        String msg3 = third.getStringExtra("Text3");
        txtviw.setText("Second page..."+msg1);
        txtviw2.setText("Second page..."+msg2);
        txtviw3.setText("Second page..."+msg3);
        bkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userinformation2.this , userinformation.class);
                startActivity(intent);
            }
        });
    }
}