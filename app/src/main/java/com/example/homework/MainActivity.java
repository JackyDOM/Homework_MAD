package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get username from the profileActivity
        String username = getIntent().getStringExtra("username");

        // initialize the id view
        TextView textView = findViewById(R.id.text1);

        // display the userName from the profileActivity
        textView.setText(username);
    }
}