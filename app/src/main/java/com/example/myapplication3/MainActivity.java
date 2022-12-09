package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button show_result;

    EditText txt1,txt2;
    String sum_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        show_result = findViewById(R.id.show_result);
        show_result.setOnClickListener(v -> {


            int num1 =Integer.parseInt(txt1.getText().toString());
            int num2 =Integer.parseInt(txt2.getText().toString());

            sum_result = String.valueOf((num1 + num2));
            Intent intent = new Intent(MainActivity.this, Result.class);
            intent.putExtra("sum",sum_result);
            startActivity(intent);
        });


    }
}