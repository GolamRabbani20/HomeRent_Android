package com.example.home_rent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {
     private TextView Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Tv=findViewById(R.id.Text1);
        Typeface typeface= ResourcesCompat.getFont(this,R.font.blacklist);
        Tv.setTypeface(typeface);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.myanim);
        Tv.setAnimation(animation);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }).start();
    }
}