package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {

    private TextView textView;
    private TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.timePicker);
        textView = findViewById(R.id.textView);

        java.util.Formatter timeF = new java.util.Formatter();
        timeF.format(
                "Time by default %d:%02d",
                timePicker.getHour(),
                timePicker.getMinute()
        );
        textView.setText(timeF.toString());
        //textView.setText(new StringBuilder("Time by default: ").append(timePicker.getHour()).append(":").append(timePicker.getMinute()));

        timePicker.setIs24HourView(true);
        timePicker.setOnTimeChangedListener((timePicker, hours, minutes) -> {
            textView.setText(new StringBuilder("Chosen time :").append(hours).append(":").append(minutes));
        });

    }


}