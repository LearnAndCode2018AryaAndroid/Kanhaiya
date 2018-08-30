package com.arya.myshoppingapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Home extends AppCompatActivity {
private boolean isUserClickedBackButton=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onBackPressed() {
        if(!isUserClickedBackButton)
        {
            Toast.makeText(this,"Press back again to exit",Toast.LENGTH_LONG).show();
        isUserClickedBackButton=true;

        }else {
            super.onBackPressed();
        }
        new CountDownTimer(3000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
              isUserClickedBackButton=false;
            }
        }.start();
    }
}
