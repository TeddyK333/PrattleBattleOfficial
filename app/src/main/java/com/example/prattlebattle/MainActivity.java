package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        Button Subscribe = (Button) findViewById(R.id.buttonSubscribe);
        Button Lessons = (Button) findViewById(R.id.buttonToLessons);
        Button Practice = (Button) findViewById(R.id.buttonToPractice);

        Lessons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, LessonsMenuActivity.class);
                startActivity(intent);
            }
        });

        Practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"To be implemented", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, PracticeActivity.class);
//                startActivity(intent);
            }
        });

        Subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this,"To be implemented", Toast.LENGTH_SHORT).show();
            }
        });





    }

    private void init() {
        if (isFirstTimeUser()) {
            Intent intent = new Intent(this, RegistrationActivity.class);
            startActivity(intent);
        }
    }

    private boolean isFirstTimeUser() {
        SharedPreferences sharedPref = getSharedPreferences("main", MODE_PRIVATE);
        return !sharedPref.getBoolean(getString(R.string.completed_registration_key), false);

    }
}



