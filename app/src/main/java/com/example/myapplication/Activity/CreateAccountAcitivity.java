package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;

public class CreateAccountAcitivity extends AppCompatActivity {
Intent intent;
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_acitivity);
        findViewById(R.id.btndangki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CreateAccountAcitivity.this, "Đăng Ký Thành Công", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnthoat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(CreateAccountAcitivity.this,loginActivity.class);
                startActivity(intent);
            }
        });
    }

}