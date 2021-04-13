package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LessonsMenuActivity extends AppCompatActivity {

    private Button less1, less2, less3, less4, less5, less6, less7, less8, less9, less10, less11, less12, less13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_menu);


        less1 = findViewById(R.id.lessons_menu_lesson_button_1);
        less2 = findViewById(R.id.lessons_menu_lesson_button_2);


        less1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
                startActivity(intent);
            }
        });

        less2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
                startActivity(intent);

            }
        });


        Toast.makeText(this, "To be implemented", Toast.LENGTH_SHORT).show();



    }
}