package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LayersActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layers);

        View buttonLayout = findViewById(R.id.counter_button);
        View textLayout = findViewById(R.id.counter_text);
        textView = textLayout.findViewById(R.id.textView);
        textView.setText("0");
        button = buttonLayout.findViewById(R.id.button);

        button.setOnClickListener(view -> {
            count++;
            textView.setText(String.valueOf(count));
        });
    }
}