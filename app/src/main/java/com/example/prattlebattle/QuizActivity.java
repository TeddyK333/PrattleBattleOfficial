package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private ArrayList<Question> quizQuestions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        init();
    }

    private void init() {
        populateQuestions();
        iterateQuestions();
    }

    private void iterateQuestions() {
        int q = 0;

        TextView question = findViewById(R.id.text_view_quiz_question_title);
        TextView[] answerViews = {
                findViewById(R.id.radio_button_quiz_answer_1),
                findViewById(R.id.radio_button_quiz_answer_2),
                findViewById(R.id.radio_button_quiz_answer_3),
        };

        // Setting code
        question.setText(quizQuestions.get(q).text);
        for (int i = 0; i < quizQuestions.get(q).answers.length; ++i) {
            answerViews[i].setText(quizQuestions.get(q).answers[i].text);
        }

        // TODO: Listen for Next button Click
            // Record users answer
            // Use same code (setting code) to replace text with next answer
    }

    private int calculateQuizScore() {
        // TODO: implement
        return 0;
    }

    private void populateQuestions() {
        quizQuestions.add(new Question(1, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I communicate in a straightforward manner - I talk directly with a person when I have a problem with them", 2),
                        new Answer(2, " I communicate in an indirect manner - I keep it to myself when I have a problem with a person ", 1),
                        new Answer(3, " I don’t talk to the person I have a problem with and instead talk about them behind their backs",  0),

                }
        ));

        quizQuestions.add(new Question(2, "TODO",
                new Answer[]{
                        new Answer(1, " I try to get my point across in the most straightforward and simple manner", 2),
                        new Answer(2, " I over complicate things ", 1),
                        new Answer(3, " I don’t even bother to explain things to other people", 0),

                }
        ));

        quizQuestions.add(new Question(3, "TODO",
                new Answer[]{
                        new Answer(1, " People often misunderstand what I say", 0),
                        new Answer(2, " I have a hard time saying what I mean ", 1),
                        new Answer(3, " I don’t have problems with getting my ideas across", 2),

                }
        ));

        quizQuestions.add(new Question(4, "TODO",
                new Answer[]{
                        new Answer(1, " When I don’t understand what the other person is saying I don’t have a hard time asking for an explanation", 2),
                        new Answer(2, " When I don’t understand what the other person is saying I don’t ask for an explanation ", 1),
                        new Answer(3, " When I don’t understand what the other person is saying I stop talking to them", 0),
                        new Answer(4, " When I don’t understand what the other person is saying I assume what they mean without consulting with them", 0),

                }
        ));
        quizQuestions.add(new Question(5, "TODO",
                new Answer[]{
                        new Answer(1, " I can understand when other people have misunderstood what I have said", 2),
                        new Answer(2, " I struggle to figure out when others have misunderstood my speech ", 1),
                        new Answer(3, " I never bother to think whether the other person understands me and proceed to talk", 0),

                }
        ));
        quizQuestions.add(new Question(6, "TODO",
                new Answer[]{
                        new Answer(1, " I try to understand other people’s point of view", 2),
                        new Answer(2, " I fail to see it from other’s point of view ", 1),
                        new Answer(3, " I get into an argument with the person because I don’t agree with their point of view", 0),


                }
        ));
        quizQuestions.add(new Question(7, "TODO",
                new Answer[]{
                        new Answer(1, " I am very worried I will say something stupid so I prefer to remain silent rather than hurting people with my ignorance", 1),
                        new Answer(2, " I know that it’s only normal to make mistakes when you’re thinking on the spot so i don’t beat myself over it but I also consider how my words may affect others", 2),
                        new Answer(3, " I say whatever whenever", 0),


                }
        ));
        quizQuestions.add(new Question(8, "TODO",
                new Answer[]{
                        new Answer(1, " I have a very expressive face - I wear my emotions on my sleeve", 1),
                        new Answer(2, " My facial expression never gives away what I am thinking or feeling ", 0),
                        new Answer(3, " I use some body language but I am sloppy with it - for example I have no idea what to do with my hands", 1),
                        new Answer(4, " I show my emotions in proportional amounts", 2),

                }
        ));
        quizQuestions.add(new Question(9, "TODO",
                new Answer[]{
                        new Answer(1, " I go into lengthy explanations", 1),
                        new Answer(2, " I get my point across briefly ", 1),
                        new Answer(3, " I never try to explain anything", 0),
                        new Answer(4, " I can both speak at length and in short depending on the situation", 2),

                }
        ));
        quizQuestions.add(new Question(10, "TODO",
                new Answer[]{
                        new Answer(1, " People often misunderstand what I say", 1),
                        new Answer(2, " I have a hard time saying what I mean ", 0),
                        new Answer(3, " I don’t have problems with getting my ideas across", 2),

                }
        ));
    }
}


