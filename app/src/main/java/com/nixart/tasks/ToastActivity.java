package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), button.getText().toString(), Toast.LENGTH_LONG).show();
        });
    }
}