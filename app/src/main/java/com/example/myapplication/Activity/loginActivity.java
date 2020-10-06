package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class loginActivity extends AppCompatActivity {
Intent intent;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = findViewById(R.id.btndangnhap);
    }

    public void dangnhap(View view) {
        intent = new Intent(loginActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void dangky(View view) {
        intent = new Intent(loginActivity.this,CreateAccountAcitivity.class);
        startActivity(intent);
    }
}