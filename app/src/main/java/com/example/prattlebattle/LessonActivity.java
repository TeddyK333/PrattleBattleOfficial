package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prattlebattle.model.Answer;
import com.example.prattlebattle.model.Lesson;
import com.example.prattlebattle.model.LessonSegment;
import com.example.prattlebattle.model.Question;

import java.util.ArrayList;

// TODO: add voiceover replay function
// TODO: stop gif when audio is over
public class LessonActivity extends AppCompatActivity {

    private ArrayList <Lesson> lessons = new ArrayList<>();
    private int currentLesson = 0;
    private int currentSegment = 0;
    MediaPlayer player;
    private Button nextButton;
    private TextView LessonTitle;
    private TextView LessonsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        nextButton = (Button) findViewById(R.id.buttonNext);
        LessonTitle = findViewById(R.id.TextViewLessonTitle);
        LessonsText = findViewById(R.id.TextViewLesson);


        init();
    };



    private void init() {
        populateLessons();
        createListener();
        //setLesson();
        setLessonSegment();

    }

    private void createListener() {
        nextButton.setOnClickListener(view -> {

            ++currentSegment;
            setLessonSegment();
//               if (currentSegment == lessons.get(currentSegment).segments.length - 1 ) {           //??
//                   ++currentLesson;
//                   setLesson();
//                   currentSegment = 0;
//               }
            });
    }

//    private void setLesson() {
//
//        LessonTitle.setText(lessons.get(currentLesson).lessonName);
//        for (int i = 0; i < lessons.get(currentLesson).segments.length; ++i) {
//            LessonTitle.setText(lessons.get(currentLesson).lessonName);
//
//
//        }
//
//    }

    private void setLessonSegment() {
        LessonsText.setText(lessons.get(currentSegment).segments[0].text);
        for (int i = 0; i < lessons.get(currentSegment).segments.length; ++i) {
            LessonsText.setText(lessons.get(currentSegment).segments[i].text);

        }

    }


    private void populateLessons() {
        lessons.add(new Lesson(1, "Lesson 1: Introduction to basic communication skills",
                new LessonSegment[]{
                        new LessonSegment(1, "In this first lesson we will just touch upon some of the basic info about communication without going into detail", ""),
                        new LessonSegment(2, " Verbal or oral communication occurs when we engage in speaking with others.  ", ""),
                        new LessonSegment(3, "Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation.",  ""),
                        new LessonSegment(4, " That’s why we consider listening and verbal communication indispensable - one whole.",  ""),
                }
        ));
        lessons.add(new Lesson(2, "Lesson 2: Types of listening to focus on",
                new LessonSegment[]{
                        new LessonSegment(1, " Most people take listening for granted; it's something that just happens to them. ", ""),

                }
        ));

    }








//    public void play(View v) {
//        if (player == null){
//            player = MediaPlayer.create(this,R.raw.song);
//            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mp) {
//                    stopPlayer();
//                }
//            });
//        }
//        Toast.makeText(this, "Audio is playing", Toast.LENGTH_SHORT).show();
//        player.start();
//    }
//    public void pause(View v) {
//        if (player != null){
//            player.pause();
//            Toast.makeText(this, "Audio paused", Toast.LENGTH_SHORT).show();
//        }
//    }
//    public void stop(View v) {
//        stopPlayer();
//
//    }
//
//    private void stopPlayer() {
//        if(player!=null){
//            player.release();
//            player = null;
//            Toast.makeText(this, "Audio stopped", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        stopPlayer();
//    }
}


