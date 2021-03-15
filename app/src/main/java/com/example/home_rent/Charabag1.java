package com.example.home_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Charabag1 extends AppCompatActivity {
    Button ContractBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charabag1);

        ContractBtn=(Button)findViewById(R.id.Contact);
        ContractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+08801661589658"));
                startActivity(intent);
            }
        });
    }
}