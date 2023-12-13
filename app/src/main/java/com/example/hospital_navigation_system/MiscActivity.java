package com.example.hospital_navigation_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MiscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc);
    }



    public void navigator_restrooms(View view) {
        Intent intent = new Intent(getApplicationContext(), navigation_restrooms.class);
        startActivity(intent);
    }



    public void navigator_pharmacy(View view) {
        Intent intent = new Intent(getApplicationContext(), navigation_pharmacy.class);
        startActivity(intent);
    }

    public void navigator_cafe(View view) {
        Intent intent = new Intent(getApplicationContext(), navigation_cafetaria.class);
        startActivity(intent);
    }

}

