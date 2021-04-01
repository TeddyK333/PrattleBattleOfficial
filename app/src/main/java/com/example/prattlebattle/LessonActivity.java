package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prattlebattle.model.Answer;
import com.example.prattlebattle.model.Lesson;
import com.example.prattlebattle.model.Question;

import java.util.ArrayList;

    public class LessonActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lesson);




            TextView lessonView = findViewById(R.id.lessonTextView);
            Button nextButton = findViewById(R.id.button2);
        ArrayList <String> lessonScript = new ArrayList<String>();
        lessonScript.add("In this first lesson we will just touch upon some of the basic info about communication without going into detail");
        lessonScript.add("Verbal or oral communication occurs when we engage in speaking with others.");
        lessonScript.add("Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation. That’s why we consider listening and verbal communication indispensable - one whole.");
        lessonScript.add("What we do while we speak often says more than the actual words. Non-verbal communication includes facial expressions, posture, eye contact, hand movements, and touch. ");
        System.out.println(lessonScript);
            nextButton.setOnClickListener(new View.OnClickListener() {
                private int index = 0;

                @Override
                public void onClick(View view) {

                    if (index < lessonScript.size()) {
                        lessonView.setText((CharSequence) lessonScript.get(index + 1));
                        index = index + 1;
                        return;
                    }

                    if (index == lessonScript.size()) {
                        lessonView.setText((CharSequence) lessonScript.get(0));
                        index = 0;
                    }


                }
            });






    }
}

