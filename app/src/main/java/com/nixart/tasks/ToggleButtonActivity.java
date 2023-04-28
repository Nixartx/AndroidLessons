package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isOn) {
        if (isOn)
            Toast.makeText(this,"Свет включен",Toast.LENGTH_SHORT).show();
        else Toast.makeText(this,"Свет выключен",Toast.LENGTH_SHORT).show();
    }
}