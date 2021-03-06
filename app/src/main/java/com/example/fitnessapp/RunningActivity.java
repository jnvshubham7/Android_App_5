package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RunningActivity extends AppCompatActivity {
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(view -> {

            Intent intent = new Intent(RunningActivity.this, MainActivity.class);
            startActivity(intent);
        });
        Intent intent = getIntent();
    }
}