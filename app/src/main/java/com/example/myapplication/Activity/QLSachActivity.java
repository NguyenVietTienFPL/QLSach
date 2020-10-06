package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class QLSachActivity extends AppCompatActivity {
Intent intent;
ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_l_sach);
        imageView1 = findViewById(R.id.imgthemsach);
        imageView2 = findViewById(R.id.imgthongtinsach);
    }

    public void themsach(View view) {
        intent = new Intent(QLSachActivity.this,AddActivity.class);
        startActivity(intent);
    }

    public void thongtinsach(View view) {
    }
}