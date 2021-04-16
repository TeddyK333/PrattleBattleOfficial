package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prattlebattle.adapter.ActionAdapter;
import com.example.prattlebattle.model.PracticeAction;

import static com.example.prattlebattle.data.Lessons.lessons;
import static com.example.prattlebattle.data.PracticeScenarios.practiceScenarios;

public class PracticeActivity extends AppCompatActivity {

    private int currentPracticeScenario = 0;
    private ActionAdapter itemsAdapter;
    private ListView listView;
    private TextView scenarioTitle;
    private TextView scenarioText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        scenarioTitle = findViewById(R.id.TextViewPracticeTitle);
        scenarioText = findViewById(R.id.TextViewPracticeText);
        listView = (ListView) findViewById(R.id.PracticeActionsList);

        init();
    }

    private void init() {
        setButtonListeners();
        setLesson();
    }

    private void setLesson() {
        scenarioTitle.setText(practiceScenarios[currentPracticeScenario].title);
        scenarioText.setText(practiceScenarios[currentPracticeScenario].text);
        itemsAdapter = new ActionAdapter(this, practiceScenarios[currentPracticeScenario].actions);
        listView.setAdapter(itemsAdapter);
    }

    private void setButtonListeners() {
        listView.setOnItemClickListener(new ActionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalName[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
            }
        });
    }
}