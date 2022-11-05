package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class userDetail extends AppCompatActivity {
    TextView tv1 ,tv2;
    RadioGroup rg1;
    RadioButton btn1 , btn2;
    Button mb1;
    CheckBox cb1 , cb2 , cb3;
    ImageView img;
    EditText et;
    String name , radio ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        tv1 = (TextView)findViewById (R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        rg1 = findViewById(R.id.rg1);
        btn1= (RadioButton) findViewById(R.id.btn1);
        btn2= (RadioButton) findViewById(R.id.btn2);
        cb1= (CheckBox) findViewById(R.id.cb1);
        cb2= (CheckBox) findViewById(R.id.cb2);
        cb3=  (CheckBox) findViewById(R.id.cb3);
        img = findViewById(R.id.img);
        et = (EditText) findViewById(R.id.et);
        mb1= (Button) findViewById(R.id.mb1);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=et.getText().toString();
                String check = "";
                if(btn1.isChecked())
                {
                    radio="Male";
                }
                else if(btn2.isChecked())
                {
                    radio = "Female";
                }
                if(cb1.isChecked())
                {
                    check = "Art";
                }
                if(cb2.isChecked())
                {
                    check = check + " Social Work";
                }
                if(cb3.isChecked())
                {
                    check = check + " , Sports";
                }
                tv2.setTextColor(getResources().getColor(R.color.black));
                tv2.setText("Hello " +name+"\n"+ name +" is "+radio +"\n" +name +" likes "+ check);
                img.setBackground(getResources().getDrawable(R.drawable.img));
            }
        });

        btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getApplicationContext(), "MALE", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getApplicationContext(), "FEMALE", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getApplicationContext(), "Hobby is Art", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getApplicationContext(), "Hobby is Social Work", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getApplicationContext(), "Hobby is Sports", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}