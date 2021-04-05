package com.example.prattlebattle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        VideoView videoView = findViewById(R.id.video_view_intro);
        String uriPath = "android.resource://com.example.prattlebattle/" + R.raw.movie;
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        videoView.setOnCompletionListener(mp -> gotToRegistration());
    }

    private void gotToRegistration() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
