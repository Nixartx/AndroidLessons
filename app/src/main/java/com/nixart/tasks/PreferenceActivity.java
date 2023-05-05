package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PreferenceActivity extends AppCompatActivity {

    TextView settingsText;
    boolean enabled;
    String login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        settingsText = findViewById(R.id.settingsText);
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        enabled = prefs.getBoolean("enabled", false);
        login = prefs.getString("login", "not set");
        settingsText.setText(login);
        if(enabled)
            settingsText.setVisibility(View.VISIBLE);
        else
            settingsText.setVisibility(View.INVISIBLE);
    }

    public void setPrefs(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}