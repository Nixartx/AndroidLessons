package com.nixart.tasks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class AlertActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        button = findViewById(R.id.button);

        AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
        builder.setMessage("Change button color?").setCancelable(false);
        builder.setPositiveButton("OK", (dialogInterface, i) -> {
            button.setBackgroundColor(Color.parseColor("#FF0000"));
        });
        builder.setNegativeButton("NO", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog dialog = builder.create();

        button.setOnClickListener(view -> {
            dialog.show();
        });



    }
}