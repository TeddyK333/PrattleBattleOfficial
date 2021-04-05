package com.example.prattlebattle;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prattlebattle.model.AgeLimit;

public class RegistrationActivity extends AppCompatActivity {

    EditText name, email, age, password;
    Button registerButton;
    SharedPreferences registration;
    String nameStr, emailStr, ageStr, passStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        // TODO: validate inputs
        // TODO: save data to shared preferences
        // TODO: move to main activity

        name = findViewById(R.id.editTextName);
        age = findViewById(R.id.editTextAge);
        password = findViewById(R.id.editTextPassword);
        email = findViewById(R.id.editTextEmail);
        registerButton = findViewById(R.id.buttonRegister);

        registration = getSharedPreferences("registration", Context.MODE_PRIVATE);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameStr = name.getText().toString();
                emailStr = email.getText().toString();
                ageStr = age.getText().toString();
                passStr = password.getText().toString();
                SharedPreferences.Editor editor = registration.edit();

                editor.putString("name",nameStr);
                editor.putString("email", emailStr);
                editor.putString("age", ageStr);
                editor.putString("password", passStr);
                editor.commit();
                Intent intent = new Intent(RegistrationActivity.this, Test.class);
                startActivity(intent);

            }
        });












    }
}
