package com.example.prattlebattle.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prattlebattle.LessonActivity;
import com.example.prattlebattle.R;

import java.util.ArrayList;

public class Lesson extends LessonActivity {
    int number;
    ArrayList<String> lessonScripts;
    TextView lessonView = findViewById(R.id.lessonTextView);
    Button nextButton = findViewById(R.id.button2);


    public  Lesson (int number, ArrayList<String> lessonScripts)
    {
        this.number = number;
        this.lessonScripts = lessonScripts;


    }


    public void LessonScript()
    {
        ArrayList <String> lessonScript1 = new ArrayList<>();
        lessonScript1.add("In this first lesson we will just touch upon some of the basic info about communication without going into detail");
        lessonScript1.add("Verbal or oral communication occurs when we engage in speaking with others.");
        lessonScript1.add("Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation. That’s why we consider listening and verbal communication indispensable - one whole.");
        lessonScript1.add("What we do while we speak often says more than the actual words. Non-verbal communication includes facial expressions, posture, eye contact, hand movements, and touch. ");
        System.out.println(lessonScript1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            private int index = 0;

            @Override
            public void onClick(View view) {

                if (index < lessonScript1.size()) {
                    lessonView.setText((CharSequence) lessonScript1.get(index + 1));
                    index = index + 1;
                    return;
                }

                if (index == lessonScript1.size()) {
                    lessonView.setText((CharSequence) lessonScript1.get(0));
                    index = 0;
                }


            }
        });
    }


}


