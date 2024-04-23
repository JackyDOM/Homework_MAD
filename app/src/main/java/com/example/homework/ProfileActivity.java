package com.example.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    // craete variables
    private EditText edtUserName;
    private EditText edtPassword;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // initialize the id
        edtUserName = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.editpassword);
        btn = (Button) findViewById(R.id.txtRegister);

        // set onClickListener to the btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();

                if(!userName.isEmpty() && !password.isEmpty()){
                    //Intent to Main-activity
                    Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                    intent.putExtra("username", userName);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(ProfileActivity.this, "Please enter your password or username", Toast.LENGTH_LONG).show();
                }
            }
        });





//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // get username and password from the user-input
//                String userName = edtUserName.getText().toString();
//                String password = edtPassword.getText().toString();
//
//                // check if the username and password is not empty
//                if(!userName.isEmpty() && !password.isEmpty()){
//                    //Toast the username and password
//                    Toast.makeText(ProfileActivity.this, "Username: " + userName + "Password: " + password, Toast.LENGTH_LONG).show();
//                }
//                else{
//                    Toast.makeText(ProfileActivity.this, "Please enter your password or username", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
    }
}
