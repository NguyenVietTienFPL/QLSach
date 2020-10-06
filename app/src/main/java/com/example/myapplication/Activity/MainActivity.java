package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
   Intent intent;
   ImageView imageView1,imageView2,imageView3,imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imguser);
        imageView2 = findViewById(R.id.imgqlBook);
        imageView3 = findViewById(R.id.imghoadon);
//        imageView4 = findViewById(R.id.imgthongke);

    }

    public void qlUser(View view) {
        intent = new Intent(MainActivity.this,QLUserActivity.class);
        startActivity(intent);
    }

    public void qlBook(View view) {

    }

    public void theloaisach(View view) {
        intent = new Intent(MainActivity.this,QLSachActivity.class);
        startActivity(intent);
    }

    public void qlHoadon(View view) {
        intent = new Intent(MainActivity.this,QLHoadonActivity.class);
        startActivity(intent);
    }

    public void thongke(View view) {

    }

}