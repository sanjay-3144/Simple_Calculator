package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2,no3;
    Button btn1,btn2,btn3,btn4;
    double n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1=findViewById(R.id.txtNo1);
        no2=findViewById(R.id.txtNo2);
        no3=findViewById(R.id.txtNo3);

        btn1=findViewById(R.id.btnAdd);
        btn2=findViewById(R.id.btnSub);
        btn3=findViewById(R.id.btnMul);
        btn4=findViewById(R.id.btnDiv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(no1.getText().toString());
                n2= Double.parseDouble(no2.getText().toString());
                n3= n1+n3;
                no3.setText(String.valueOf(n3));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(no1.getText().toString());
                n2= Double.parseDouble(no2.getText().toString());
                n3=n1-n2;
                no3.setText(String.valueOf(n3));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1*n2;
                no3.setText(String.valueOf(n3));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1/n2;
                no3.setText(String.valueOf(n3));
            }
        });

    }

}