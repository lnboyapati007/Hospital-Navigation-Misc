package com.example.hospital_navigation_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonMisc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        buttonMisc = findViewById(R.id.misc);
//
//
//        buttonMisc.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MiscActivity.class)));

    }

    public void misc_act(View view) {

        Intent intent = new Intent(getApplicationContext(), MiscActivity.class);
        startActivity(intent);
    }

}

