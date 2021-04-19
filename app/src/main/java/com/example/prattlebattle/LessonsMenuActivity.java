package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LessonsMenuActivity extends AppCompatActivity {

    private Button less1, less2, less3, less4, less5, less6, less7, less8, less9, less10, less11, less12, less13, less14, less15, less16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_menu);


        less1 = findViewById(R.id.lessons_menu_lesson_button_1);
        less2 = findViewById(R.id.lessons_menu_lesson_button_2);
        less3 = findViewById(R.id.lessons_menu_lesson_button_3);
        less4 = findViewById(R.id.lessons_menu_lesson_button_4);
        less5 = findViewById(R.id.lessons_menu_lesson_button_5);
        less6 = findViewById(R.id.lessons_menu_lesson_button_6);
        less7 = findViewById(R.id.lessons_menu_lesson_button_7);
        less8 = findViewById(R.id.lessons_menu_lesson_button_8);
        less9 = findViewById(R.id.lessons_menu_lesson_button_9);
        less10 = findViewById(R.id.lessons_menu_lesson_button_10);
        less11 = findViewById(R.id.lessons_menu_lesson_button_11);
        less12 = findViewById(R.id.lessons_menu_lesson_button_12);
        less13 = findViewById(R.id.lessons_menu_lesson_button_13);
        less14 = findViewById(R.id.lessons_menu_lesson_button_14);
        less15 = findViewById(R.id.lessons_menu_lesson_button_15);
        less16 = findViewById(R.id.lessons_menu_lesson_button_16);


        less1.setOnClickListener(view -> {
            Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
            intent.putExtra("lessonNumber", 0);
            startActivity(intent);
        });
        less2.setOnClickListener(view -> {
            Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
            intent.putExtra("lessonNumber", 1);
            startActivity(intent);
        });
        less3.setOnClickListener(view -> {
            Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
            intent.putExtra("lessonNumber", 2);
            startActivity(intent);
        });
        less4.setOnClickListener(view -> {
            Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
            intent.putExtra("lessonNumber", 3);
            startActivity(intent);
        });
        less5.setOnClickListener(view -> {
            Intent intent = new Intent(LessonsMenuActivity.this, LessonActivity.class);
            intent.putExtra("lessonNumber", 4);
            startActivity(intent);
        });
        less6.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less7.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less8.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less9.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less10.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less11.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less12.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less13.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less14.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less15.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());
        less16.setOnClickListener(view -> Toast.makeText(LessonsMenuActivity.this, "To be implemented", Toast.LENGTH_SHORT).show());

    }
}