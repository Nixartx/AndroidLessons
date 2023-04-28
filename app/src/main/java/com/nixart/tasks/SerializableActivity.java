package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class SerializableActivity extends AppCompatActivity {

    private final UserData userData = new UserData();
    private EditText name, surname, age;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serializable);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(view ->{
            userData.setName(name.getText().toString());
            userData.setSurname(surname.getText().toString());
            userData.setAge(Integer.parseInt(age.getText().toString()));

            Intent intent = new Intent(SerializableActivity.this, SecondSerializableActivity.class);
            intent.putExtra("object", userData);
            startActivity(intent);
        });

    }
}

class UserData implements Serializable {
    private String name;
    private String surname;
    private int age;

    public UserData() {}

    public UserData(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}