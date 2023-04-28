package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAdapterActivity extends AppCompatActivity {

    private String[] fruits = { "apple", "lemon", "kiwi", "mango", "melon"};
    private ListView listView;
    private Spinner spinner;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,fruits);
        ArrayAdapter<String> adapter_spinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, fruits);

        listView.setAdapter(adapter);

        spinner.setAdapter(adapter_spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}