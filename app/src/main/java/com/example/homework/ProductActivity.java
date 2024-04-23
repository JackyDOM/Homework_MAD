package com.example.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }

    public void ProductLinearLayout(View view){
        Intent intent = new Intent(ProductActivity.this, DetailProductActivity.class);
        startActivity(intent);
    }
}
