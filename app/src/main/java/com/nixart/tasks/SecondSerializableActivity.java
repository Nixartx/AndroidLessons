package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondSerializableActivity extends AppCompatActivity {

    private TextView name, surname,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_serializable);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);

        Intent intent = getIntent();
        UserData userData = (UserData) intent.getSerializableExtra("object");

        name.setText(userData.getName());
        surname.setText(userData.getSurname());
        age.setText(String.valueOf(userData.getAge()));

    }
}