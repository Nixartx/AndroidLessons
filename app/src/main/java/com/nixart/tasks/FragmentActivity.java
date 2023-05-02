package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity implements ListFragment.OnFragmentSendDataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public void onSendData(String selectedItem) {
        DetailFragment fragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isVisible())
            fragment.setSelectedItem(selectedItem);
        else {
            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            startActivity(intent);
        }
    }
}