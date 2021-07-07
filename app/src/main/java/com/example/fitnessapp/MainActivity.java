package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button go_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_btn = findViewById(R.id.go_btn);
//        Intent intent = new Intent(MainActivity.this, RunningActivity.class);
//        startActivity(intent);
        go_btn.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, RunningActivity.class);
            startActivity(intent);

        });
        Intent intent = getIntent();
    }
}