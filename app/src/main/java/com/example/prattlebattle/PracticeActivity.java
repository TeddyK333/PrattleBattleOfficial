package com.example.prattlebattle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.prattlebattle.adapter.ActionAdapter;
import com.example.prattlebattle.data.PracticeScenarios;
import com.example.prattlebattle.model.PracticeAction;

import static com.example.prattlebattle.data.Lessons.lessons;
import static com.example.prattlebattle.data.PracticeScenarios.practiceScenarios;

public class PracticeActivity extends AppCompatActivity {

    private int currentPracticeScenario = 0;
    private ActionAdapter itemsAdapter;
    private ListView listView;
    private TextView scenarioTitle;
    private TextView scenarioText;
    private ImageView scenarioImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        scenarioTitle = findViewById(R.id.TextViewPracticeTitle);
        scenarioText = findViewById(R.id.TextViewPracticeText);
        scenarioImage = findViewById(R.id.imageViewPractice);
        listView = (ListView) findViewById(R.id.PracticeActionsList);


        init();
    }

    private void init() {
        setListeners();
        setScenario();
    }

    private void setScenario() {
        scenarioTitle.setText(practiceScenarios[currentPracticeScenario].title);
        scenarioText.setText(practiceScenarios[currentPracticeScenario].text);
        scenarioImage.setImageResource(practiceScenarios[currentPracticeScenario].image);
        itemsAdapter = new ActionAdapter(this, practiceScenarios[currentPracticeScenario].actions);
        listView.setAdapter(itemsAdapter);
    }

    private void setListeners() {
        listView.setOnItemClickListener((parent, view, position, id) -> onActionClick(position));
    }

    private void onActionClick(int actionNumber) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(practiceScenarios[currentPracticeScenario].actions[actionNumber].hint);
        builder.setCancelable(false);

        String buttonText = practiceScenarios[currentPracticeScenario].actions[actionNumber].isCorrect ?
                "Next" : "Try again";

        builder.setPositiveButton(
                buttonText,
                (dialog, id) -> {
                    dialog.cancel();
                    continueFormAction(actionNumber);
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void continueFormAction(int actionNumber) {
        if (practiceScenarios[currentPracticeScenario].actions[actionNumber].isCorrect) {
            if (currentPracticeScenario == practiceScenarios.length - 1) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                ++currentPracticeScenario;
                setScenario();
            }
        }



    //TODO get rid of white boxes when there is no hint or write a hint suitable for the situation



        }
    }

