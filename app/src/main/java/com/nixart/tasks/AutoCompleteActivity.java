package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class AutoCompleteActivity extends AppCompatActivity {

    private static final String[] SUGGESTIONS = {
            "ChatGPT",
            "Google",
            "GoGetLinks",
            "Pikabu",
            "Pr-Cy",
            "YouTube",
            "Plurrimi",
            "Midjourney"
    };
    private AutoCompleteTextView mAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        mAutoCompleteTextView = findViewById(R.id.my_autocomplete_textview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, SUGGESTIONS);
        mAutoCompleteTextView.setAdapter(adapter);

        mAutoCompleteTextView.setThreshold(2); // Show suggestions after 2 characters
    }
}