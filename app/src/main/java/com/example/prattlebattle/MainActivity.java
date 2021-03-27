package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this, QuizActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);

        VideoView mVideoView2 = findViewById(R.id.videoView1);
        String uriPath2 = "android.resource://com.example.prattlebattle/" + R.raw.movie;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);             /*need*/
        mVideoView2.requestFocus();
        mVideoView2.start();

        Button btn_3 = findViewById(R.id.button3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            //connects the button to a new activity                 /*need*/
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, QuizActivity.class));
            }

        });
    }
}



