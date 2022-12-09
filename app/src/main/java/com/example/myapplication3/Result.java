package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    Button backbutton;
    TextView received_result ;
    String sum_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        backbutton = findViewById(R.id.backbutton);
        received_result =findViewById(R.id.result);
        Intent intent = getIntent();
        sum_result = intent.getStringExtra("sum");
        received_result.setText(sum_result);
        backbutton.setOnClickListener(v -> {
            Intent intent2 = new Intent(Result.this, MainActivity.class);

            startActivity(intent2);
        });
    }
}