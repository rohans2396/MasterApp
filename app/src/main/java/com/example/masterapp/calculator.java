package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
    EditText et;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btndiv,btnmultiply,
            btnc , btnequal , btndot;
    boolean add ,sub , mul , div;
    Float val1 , val2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et = (EditText) findViewById(R.id.et);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnc = (Button) findViewById(R.id.btnc);
        btndot = (Button) findViewById(R.id.btndot);
        btnequal = (Button) findViewById(R.id.btnequal);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"0");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +"9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() +".");
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(" ");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText(" ");
                }
                else
                {
                    val1=Float.parseFloat(et.getText() + " ");
                    add=true;
                    et.setText(null);
                }
            }
        });


        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText(" ");
                }
                else
                {
                    val1=Float.parseFloat(et.getText() + " ");
                    sub=true;
                    et.setText(null);
                }
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText(" ");
                }
                else
                {
                    val1=Float.parseFloat(et.getText() + " ");
                    mul=true;
                    et.setText(null);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText(" ");
                }
                else
                {
                    val1=Float.parseFloat(et.getText() + "");
                    div=true;
                    et.setText(null);
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(et.getText() + " ");
                if (add == true) {
                    et.setText(val1 + val2 + " ");
                    add = false;
                }

                if (sub == true) {
                    et.setText(val1 - val2 + " ");
                    sub = false;
                }

                if (mul == true) {
                    et.setText(val1 * val2 + " ");
                    mul = false;
                }

                if (div == true) {
                    et.setText(val1 / val2 + " ");
                    div = false;
                }
            }
        });

    }
}