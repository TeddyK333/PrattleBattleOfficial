package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.prattlebattle.data.Lessons.lessons;


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
    private ImageView character;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        // TODO: get from intent the current lesson and segment
        // homeandlearn.co.uk/android/intent_put_extra.html

        nextButton = (Button) findViewById(R.id.buttonNext);
        playButton = (Button) findViewById(R.id.buttonPlay);
        pauseButton = (Button) findViewById(R.id.buttonPause);
        stopButton = (Button) findViewById(R.id.buttonStop);
        lessonTitle = findViewById(R.id.TextViewLessonTitle);
        lessonScript = findViewById(R.id.TextViewLesson);
        character = findViewById(R.id.gifCharacterImageView);






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
        lessonTitle.setText(lessons[currentLesson].lessonName);
        setSegment();
    }

    private void setSegment() {
        lessonScript.setText(lessons[currentLesson].segments[currentSegment].text);
        play();
        playGif();

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


       // Check if last Segment ??
        if (lessons[currentLesson].segments.length - 1 == currentSegment - 1) {

            if (lessons.length -1 != currentLesson )
            {
                stop();
                ++currentLesson;
                currentSegment = 0;
                setLesson();
            }else
            {
                Toast.makeText(this, " More lessons to be implemented", Toast.LENGTH_SHORT).show();
            }


        }





    }




    private void play() {
        if (player == null){
            int audioLink = lessons[currentLesson].segments[currentSegment].audioLink;
            player = MediaPlayer.create(this, audioLink);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stop();
                }
            });
        }

        player.start();
        playGif();
    }

    private void pause() {
        if (player != null){
            player.pause();
            stopGif();
        }
    }

    private void stop() {
        if(player!=null){
            player.release();
            player = null;
            stopGif();
        }
    }

    private void stopGif() {
        Drawable drawable = character.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    private void playGif()
    {
        Drawable drawable = character.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }




}


