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

import com.example.prattlebattle.data.Lessons;
import com.example.prattlebattle.model.Answer;
import com.example.prattlebattle.model.Lesson;
import com.example.prattlebattle.model.LessonSegment;
import com.example.prattlebattle.model.Question;

import java.util.ArrayList;

// TODO: add voiceover replay function
// TODO: stop gif when audio is over
public class LessonActivity extends AppCompatActivity {

    private int currentLesson = 0;
    private int currentSegment = 0;
    private MediaPlayer player;
    private Button nextButton;
    private Button playButton;
    private Button pauseButton;
    private Button stopButton;
    private TextView lessonTitle;
    private TextView lessonScript;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        // TODO: get form intent the current lesson and segment

        nextButton = (Button) findViewById(R.id.buttonNext);
        playButton = (Button) findViewById(R.id.buttonPlay);
        pauseButton = (Button) findViewById(R.id.buttonPause);
        stopButton = (Button) findViewById(R.id.buttonStop);
        lessonTitle = findViewById(R.id.TextViewLessonTitle);
        lessonScript = findViewById(R.id.TextViewLesson);

        init();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop();
    }

    private void init() {
        setButtonListeners();
        setLesson();
    }

    private void setLesson() {
        lessonTitle.setText(Lessons.lessons[currentLesson].lessonName);
        setSegment();
    }

    private void setSegment() {
        lessonScript.setText(Lessons.lessons[currentLesson].segments[currentSegment].text);
        play();
    }

    private void setButtonListeners() {
        nextButton.setOnClickListener(view -> next());
        playButton.setOnClickListener(view -> play());
        pauseButton.setOnClickListener(view -> pause());
        stopButton.setOnClickListener(view -> stop());
    }

    private void next() {
        // TODO: check for next lesson/segment
        stop();
        ++currentSegment;
        setSegment();
    }


    private void play() {
        if (player == null){
            int audioLink = Lessons.lessons[currentLesson].segments[currentSegment].audioLink;
            player = MediaPlayer.create(this, audioLink);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stop();
                }
            });
        }
        Toast.makeText(this, "Audio is playing", Toast.LENGTH_SHORT).show();
        player.start();
    }

    private void pause() {
        if (player != null){
            player.pause();
            Toast.makeText(this, "Audio paused", Toast.LENGTH_SHORT).show();
        }
    }

    private void stop() {
        if(player!=null){
            player.release();
            player = null;
            Toast.makeText(this, "Audio stopped", Toast.LENGTH_SHORT).show();
        }
    }
}


