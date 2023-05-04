package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MultithreadActivity extends AppCompatActivity {

    private int currentValue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multithread);

    }
}