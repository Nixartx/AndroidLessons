package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        textView = findViewById(R.id.textView);
        datePicker = findViewById(R.id.datepicker);

//        Calendar today = Calendar.getInstance();
//        textView.setText(new StringBuilder().append("Default date: ").append(today.get(Calendar.DAY_OF_MONTH)).append("/").append(today.get(Calendar.MONTH)+1).append("/").append(today.get(Calendar.YEAR)));
//
//        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
//                textView.setText(new StringBuilder().append("Chosen date: ").append(day).append("/").append(month+1).append("/").append(year));
//            }
//        });

        textView.setText(new StringBuilder("Default date: ").append(datePicker.getDayOfMonth()).append("/").append(datePicker.getMonth()+1).append("/").append(datePicker.getYear()));

        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), (datePicker1, year, month, day) -> {
            textView.setText(new StringBuilder("Chosen date: ").append(day).append("/").append(month+1).append("/").append(year));
        });
    }
}