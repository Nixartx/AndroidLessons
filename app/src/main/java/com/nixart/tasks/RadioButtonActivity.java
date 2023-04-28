package com.nixart.tasks;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        textView = findViewById(R.id.textView);
        textView.setText("Checked: ");
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_java:
                if (checked) {
                    textView.setText("Checked: " + ((RadioButton) view).getText());
                    break;
                }
            case R.id.radio_js:
                if (checked) {
                    textView.setText("Checked: " + ((RadioButton) view).getText());
                    break;
                }
        }
    }
}
