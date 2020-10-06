package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;

public class AddHoadonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hoadon);
        findViewById(R.id.btnthem).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddHoadonActivity.this, "Thêm Hóa Đơn Thành Công", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnthoat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddHoadonActivity.this,QLHoadonActivity.class);
                startActivity(intent);
            }
        });
    }
}