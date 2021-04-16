package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        Button Subscribe =  findViewById(R.id.buttonSubscribe);
        Button Lessons =  findViewById(R.id.buttonToLessons);
        Button Practice = findViewById(R.id.buttonToPractice);
        Button Events =  findViewById(R.id.buttonToEvents);
        Button Consultations =  findViewById(R.id.buttonToConsult);

        Lessons.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LessonsMenuActivity.class);
            startActivity(intent);
        });

        Practice.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PracticeActivity.class);
            startActivity(intent);
        });

        Subscribe.setOnClickListener(view -> Toast.makeText(MainActivity.this,"To be implemented", Toast.LENGTH_SHORT).show());

        Events.setOnClickListener(view -> Toast.makeText(MainActivity.this,"To be implemented", Toast.LENGTH_SHORT).show());

        Consultations.setOnClickListener(view -> Toast.makeText(MainActivity.this,"To be implemented", Toast.LENGTH_SHORT).show());
    }

    private void init() {
        if (isFirstTimeUser()) {
            Intent intent = new Intent(this, IntroActivity.class);
            startActivity(intent);
        }
    }

    private boolean isFirstTimeUser() {
        SharedPreferences sharedPref = getSharedPreferences("main", MODE_PRIVATE);
        return !sharedPref.getBoolean(getString(R.string.completed_registration_key), false);
    }
}



