package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox checkBoxJava, checkBoxJavaScript;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        textView = findViewById(R.id.textView);
        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxJava.setOnCheckedChangeListener(new MyCheckedChangeListener(textView));

        checkBoxJavaScript = findViewById(R.id.checkBoxJavaScript);
        checkBoxJavaScript.setOnCheckedChangeListener(new MyCheckedChangeListener(textView));

    }
}

class MyCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {
    private TextView textView;

    public MyCheckedChangeListener(TextView textView){
        this.textView = textView;
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) textView.setText(buttonView.getText());
        else textView.setText("");
    }
}