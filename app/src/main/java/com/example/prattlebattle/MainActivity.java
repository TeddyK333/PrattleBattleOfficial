package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


                Intent intent = new Intent(MainActivity.this, LessonActivity.class);
                startActivity(intent);
            }
        });

        Practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, PracticeActivity.class);
                startActivity(intent);
            }
        });


//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);


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



