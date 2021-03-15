package com.example.home_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kumkumari extends AppCompatActivity {
    private Button M_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumkumari);

        M_btn=findViewById(R.id.More1);
        M_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent=new Intent(Kumkumari.this,Kumkumari1.class);
                startActivity(Myintent);
            }
        });

        M_btn=findViewById(R.id.More2);
        M_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent=new Intent(Kumkumari.this,Kumkumari1.class);
                startActivity(Myintent);
            }
        });

        M_btn=findViewById(R.id.More3);
        M_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent=new Intent(Kumkumari.this,Kumkumari1.class);
                startActivity(Myintent);
            }
        });

        M_btn=findViewById(R.id.More0);
        M_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent=new Intent(Kumkumari.this,Kumkumari1.class);
                startActivity(Myintent);
            }
        });
    }

    }
