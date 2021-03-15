package com.example.home_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khagan1 extends AppCompatActivity {
     Button ContractBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khagan1);
        ContractBtn=(Button)findViewById(R.id.Contact);
        ContractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Myintent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+08801861589658"));
                startActivity(Myintent);
            }
        });
    }
}