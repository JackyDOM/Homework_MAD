package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

import com.example.homework.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaccefragement(new HomeFragment());
        binding.BottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.menuHome) {
                // Add code for handling the "Home" menu item
                replaccefragement(new HomeFragment());
            } else if (itemId == R.id.menuProvince) {
                // Add code for handling the "Province" menu item
                replaccefragement(new ProvinceFragment());
            } else if (itemId == R.id.menuSearch) {
                // Add code for handling the "Search" menu item
                replaccefragement(new SearchFragment());
            }

            return true;
        });
//        // get username from the profileActivity
//        String username = getIntent().getStringExtra("username");
//
//        // initialize the id view
//        TextView textView = findViewById(R.id.text1);
//
//        // display the userName from the profileActivity
//        textView.setText(username);
    }

    private void replaccefragement(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}