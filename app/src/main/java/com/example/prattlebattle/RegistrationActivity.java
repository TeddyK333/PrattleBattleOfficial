package com.example.prattlebattle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RegistrationActivity extends AppCompatActivity {

    private static final int AGE_MIN = 5;
    private static final int AGE_MAX = 100;

    private Button registerButton;
    private String name, email, pass;
    private int age = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText nameEditText = findViewById(R.id.editTextName);
        EditText ageEditText = findViewById(R.id.editTextAge);
        EditText passwordEditText = findViewById(R.id.editTextPassword);
        EditText emailEditText = findViewById(R.id.editTextEmail);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(view -> {
            name = nameEditText.getText().toString();
            email = emailEditText.getText().toString();
            age = ageEditText.getText().toString().length() > 0 ? Integer.parseInt(ageEditText.getText().toString()) : 0;
            pass = passwordEditText.getText().toString();
            String ageString = String.valueOf(age);


            if (isInputValid()) {
                SharedPreferences sharedPref = getSharedPreferences("main", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();


                editor.putString(getString(R.string.user_name_key), name);
                editor.putString(getString(R.string.user_email_key), email);
                editor.putInt(getString(R.string.user_age_key), age);
                editor.putString(getString(R.string.user_password_key), pass); //TODO: Hash password before save (Next Iteration)
                editor.putBoolean(getString(R.string.completed_registration_key), true);
                editor.apply();

                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean isInputValid() {
        return allFieldsAreFilled() && isAgeValid() && isEmailValid();
    }

    private boolean allFieldsAreFilled() {
        if (name.matches("") || email.matches("") || pass.matches("")) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private boolean isAgeValid() {
        if (age >= AGE_MIN && age <= AGE_MAX) {
            return true;
        }
        Toast.makeText(this, R.string.invalidAge, Toast.LENGTH_SHORT).show();
        return false;
    }

    private boolean isEmailValid() {
        if (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        }
        Toast.makeText(this, R.string.invalidAge, Toast.LENGTH_SHORT).show();
        return false;
    }
}
