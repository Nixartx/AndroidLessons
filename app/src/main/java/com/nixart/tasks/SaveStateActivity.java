package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SaveStateActivity extends AppCompatActivity {
    Fruit fruit = new Fruit("undefined", "kg");
    final static String userVariableKey = "FRUIT_VARIABLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_state);
    }

    // saving state
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putSerializable(userVariableKey, fruit);
        super.onSaveInstanceState(outState);
    }
    // load saved state
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        fruit = (Fruit) savedInstanceState.getSerializable(userVariableKey);
        TextView dataView = findViewById(R.id.dataView);
        dataView.setText("Name: " + fruit.getName() + " Unit: " + fruit.getUnit());
    }
    public void saveData(View view) {

        EditText nameBox = findViewById(R.id.nameBox);
        EditText unitBox = findViewById(R.id.unit);
        String name = nameBox.getText().toString();
        String unit = "";  // default value
        try{
            unit = unitBox.getText().toString();
        }
        catch (NumberFormatException ex){}
        fruit = new Fruit(name, unit);
    }
    public void getData(View view) {

        TextView dataView = findViewById(R.id.dataView);
        dataView.setText("Name: " + fruit.getName() + " Unit: " + fruit.getUnit());
    }
}