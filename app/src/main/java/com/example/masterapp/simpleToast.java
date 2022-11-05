package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class simpleToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_toast);
        Toast.makeText(getApplicationContext(),
                "First Toast Message!!", Toast.LENGTH_LONG).show();
    }
}