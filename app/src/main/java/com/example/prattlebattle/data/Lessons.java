package com.example.prattlebattle.data;

import com.example.prattlebattle.R;
import com.example.prattlebattle.model.Lesson;
import com.example.prattlebattle.model.LessonSegment;

public class Lessons {

    private final static Lesson lesson1 = new Lesson(1, "Lesson 1: Introduction to basic communication skills",
            new LessonSegment[]{
                    new LessonSegment(1, "In this first lesson we will just touch upon some of the basic info about communication without going into detail", R.raw.testvoice1),
                    new LessonSegment(2, " Verbal or oral communication occurs when we engage in speaking with others.", R.raw.testvoice2),
                    new LessonSegment(3, "Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation.",  R.raw.testvoice1),
                    new LessonSegment(4, " That’s why we consider listening and verbal communication indispensable - one whole.",  R.raw.testvoice1),
            }
    );

    private final static Lesson lesson2 = new Lesson(1, "Lesson 1: Introduction to basic communication skills",
            new LessonSegment[]{
                    new LessonSegment(1, "In this first lesson we will just touch upon some of the basic info about communication without going into detail", R.raw.testvoice1),
                    new LessonSegment(2, " Verbal or oral communication occurs when we engage in speaking with others.  ", R.raw.testvoice1),
                    new LessonSegment(3, "Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation.",  R.raw.testvoice1),
                    new LessonSegment(4, " That’s why we consider listening and verbal communication indispensable - one whole.",  R.raw.testvoice1),
            }
    );

    public final static Lesson[] lessons = {lesson1, lesson2};
}
