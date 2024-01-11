package com.example.hw2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_add;
    private TextView tvresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,Second.class);
            startActivity(i);
            finish();
        });
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
                User user = (User) arguments.getSerializable("user");
                String name = user.getName();
                String age = String.valueOf(user.getAge());
                String gender = user.getGender();



                String result = "Name" + name + "\nAge" + age + "Gender" + gender;
                tvresult.setText(result);
                  }
            }
      }




