package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView t1,t2,t3,t4;
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView3);
        t3 = findViewById(R.id.textView4);
        t4 = findViewById(R.id.textView5);

        SharedPreferences registration = getApplicationContext().getSharedPreferences("registration", Context.MODE_PRIVATE);
        String name = registration.getString("name", "");
        String email = registration.getString("email","");
        String age = registration.getString("age","");
        String password = registration.getString("password","");

        t1.setText(name);
        t2.setText(email);
        t3.setText(age);
        t4.setText(password);


    }

}