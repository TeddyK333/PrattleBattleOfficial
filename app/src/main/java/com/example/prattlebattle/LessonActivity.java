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

// TODO: add voiceover replay function
// TODO: stop gif when audio is over
public class LessonActivity extends AppCompatActivity {

    private ArrayList <Lesson> lessons = new ArrayList<>();
    private int currentLesson = 0;
    private int currentSegment = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);



    }
}

