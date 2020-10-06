package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.R;

public class helloActivity extends AppCompatActivity {
    Intent intent;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(helloActivity.this,loginActivity.class);
                startActivity(intent);
            }
        },3000);

    }
}