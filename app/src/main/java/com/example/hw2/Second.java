package com.example.hw2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Second extends AppCompatActivity {

    private EditText name, age, gender;

    private Button btnsave;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.ed_username);
        age = findViewById(R.id.ed_age);
        gender = findViewById(R.id.ed_genter);
        btnsave = findViewById(R.id.btn_add);

        btnsave.setOnClickListener(view -> {
            String username = name.getText().toString();
            String userage = age.getText().toString();
            String usergender = gender.getText().toString();
            User user = new User(username,userage,usergender);
            Intent i = new Intent(this,MainActivity.class);
            i.putExtra("user",user);
            startActivity(i);
            finish();

        });


    }

}