package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.seekbar_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SeekBarActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.datepicker_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DatePickerActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.timepicker_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TimePickerActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.autocomplete_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AutoCompleteActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.checkbox_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CheckboxActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.checkbox_btn_v2).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CheckboxActivityV2.class);
            startActivity(intent);
        });

        findViewById(R.id.togglebutton_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ToggleButtonActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.radiobutton_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.toast_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ToastActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.alert_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AlertActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.serializable_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SerializableActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.imageview_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.arrayadapter_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.custom_adapter_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.layers_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LayersActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.fragments_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.multithread_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MultithreadActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.webview_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.httpurlconnection_btn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HttpUrlActivity.class);
            startActivity(intent);
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(getApplicationContext(), item.getTitle().toString(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
