package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread myThread=runOnUiThread();
        try{
            sleep(0000);
            Intent intent=new Intent(getApplicationContext().MainActivity.java);
            startActivity(intent);
            finish();

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void sleep(int i) {
    }
    myThread.start();
}