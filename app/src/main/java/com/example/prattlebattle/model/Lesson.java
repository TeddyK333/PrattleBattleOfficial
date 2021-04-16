package com.example.prattlebattle.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prattlebattle.LessonActivity;
import com.example.prattlebattle.R;

import java.util.ArrayList;

public class Lesson {
    public String lessonName;
    public LessonSegment[] segments;
    public boolean isCompleted;

    public Lesson(String lessonName, LessonSegment[] segments) {
        this.lessonName = lessonName;
        this.segments = segments;

    }
}





