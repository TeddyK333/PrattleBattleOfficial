package com.example.prattlebattle.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prattlebattle.LessonActivity;
import com.example.prattlebattle.R;

import java.util.ArrayList;

public class Lesson {
    public int number;
    public String lessonName;
    public LessonSegment[] segments;
    public boolean isCompleted;

    public Lesson(int number, String lessonName, LessonSegment[] segments) {
        this.number = number;
        this.lessonName = lessonName;
        this.segments = segments;

    }
}





