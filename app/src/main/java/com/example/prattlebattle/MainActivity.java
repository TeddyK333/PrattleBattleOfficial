package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();




//        Intent intent = new Intent(this, QuizActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
    }

    private void init() {
        if (isFirstTimeUser()){
            Intent intent = new Intent(this, IntroActivity.class);
            startActivity(intent);
        }
    }

    private boolean isFirstTimeUser() {
        SharedPreferences sharedPref = getSharedPreferences("main", MODE_PRIVATE);
        return !sharedPref.getBoolean(getString(R.string.completed_registration_key), false);
    }
}



