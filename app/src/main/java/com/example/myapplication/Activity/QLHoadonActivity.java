package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class QLHoadonActivity extends AppCompatActivity {
   Intent intent;
   ImageView imageView,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_l_hoadon);
        imageView = findViewById(R.id.imgthemhoadon);
        imageView2 = findViewById(R.id.imgthongtinhoadon);
    }

    public void themhoadon(View view) {
        intent = new Intent(QLHoadonActivity.this,AddHoadonActivity.class);
        startActivity(intent);
    }

    public void thongtinhoadon(View view) {

    }
}