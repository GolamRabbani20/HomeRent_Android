package com.example.home_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectArea extends AppCompatActivity {
    private Button K_Btn,C_Btn,Kh_Btn,D_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_area);
//Charabag
        C_Btn=findViewById(R.id.charabag);
        C_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent=new Intent(SelectArea.this,Charabag.class);
                startActivity(Myintent);
            }
        });
//Kumkumari
        K_Btn=findViewById(R.id.kumkumari);
        K_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectArea.this,Kumkumari.class);
                startActivity(intent);
            }
        });

//Khagan
        Kh_Btn=findViewById(R.id.khagan);
        Kh_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent2=new Intent(SelectArea.this,Khagan.class);
                startActivity(Myintent2);
            }
        });

//Dottopara

        D_Btn=findViewById(R.id.dottopara);
        D_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent3=new Intent(SelectArea.this,Dottopara.class);
                startActivity(Myintent3);
            }
        });


    }
}