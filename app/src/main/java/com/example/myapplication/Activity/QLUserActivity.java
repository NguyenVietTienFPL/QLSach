package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class QLUserActivity extends AppCompatActivity {
    Intent intent;
    ImageView imageView1,imageView2,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_l_user);
        imageView1 = findViewById(R.id.imgqluser);
        // imageView2 =findViewById(R.id.imgbook);
        imageView3 = findViewById(R.id.imgqlBook);
    }

    public void qlTaiKhoanUser(View view) {
        
    }

    public void doiPassword(View view) {
        intent = new Intent(QLUserActivity.this,ChangePasswordActivity.class);
        startActivity(intent);
    }

    public void dangxuat(View view) {
        intent = new Intent(QLUserActivity.this,loginActivity.class);
        startActivity(intent);
    }
}