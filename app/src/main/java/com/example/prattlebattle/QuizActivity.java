package com.example.prattlebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.example.prattlebattle.model.Answer;
import com.example.prattlebattle.model.Question;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private ArrayList <Question> quizQuestions = new ArrayList<>();
    private int currentQuestion = 0;
    private int totalScore = 0;

    private TextView question;
    private RadioButton[] answerViews;
    private Button nextQuestionButton;
    private RadioGroup radioGroupAnswers;
    private TextView quizScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        radioGroupAnswers =  findViewById(R.id.radio_group_quiz_answers);
        nextQuestionButton = findViewById(R.id.button_quiz_next);
        question = findViewById(R.id.text_view_quiz_question_title);
        quizScoreTextView = findViewById((R.id.textViewQuizScore));
        answerViews = new RadioButton[]{
                findViewById(R.id.radio_button_quiz_answer_1),
                findViewById(R.id.radio_button_quiz_answer_2),
                findViewById(R.id.radio_button_quiz_answer_3),
                findViewById(R.id.radio_button_quiz_answer_4),
        };

        init();
    }

    private void init() {
        populateQuestions();
        createListener();
        setQuestion();
    }

    private void createListener() {
        nextQuestionButton.setOnClickListener(view -> {
            if (radioGroupAnswers.getCheckedRadioButtonId() != -1) {
                int id = radioGroupAnswers.indexOfChild(radioGroupAnswers.findViewById(radioGroupAnswers.getCheckedRadioButtonId()));
                totalScore += quizQuestions.get(currentQuestion).answers[id].score;
                radioGroupAnswers.clearCheck();

                if (currentQuestion == quizQuestions.size() - 1) {
                    SharedPreferences sharedPreferences = getSharedPreferences("main", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("score", totalScore);
                    editor.apply();
                    question.setText("Scores");
                    ++currentQuestion;
                    radioGroupAnswers.setVisibility(View.GONE);
                    quizScoreTextView.setVisibility(View.VISIBLE);
                    if(totalScore < 8) {
                        nextQuestionButton.setText(getResources().getString(R.string.NextButton));
                        quizScoreTextView.setText("You need to keep working on your communication skills. You are not expressing yourself clearly, and you might even be misinterpreting messages. The good news is that you can develop your communication skills by paying close attention to how you communicate." + "Join me in this adventure where we can learn together!");
                    }else if(totalScore < 15)
                    {
                        nextQuestionButton.setText(getResources().getString(R.string.NextButton));
                        quizScoreTextView.setText("You're a good communicator, but you have communication issues from time to time. Take some time to consider your communication strategy, and pay attention to how well you receive messages as well as how well you deliver them. This will assist you in improving your communication skills." + "Join me in this adventure where we can learn together!");
                    }
                    else {
                        nextQuestionButton.setText(getResources().getString(R.string.NextButton));
                        quizScoreTextView.setText("Generally, you are aware of your position as a communicator, both when sending and receiving messages. But there is always room for improvement."  + "Join me in this adventure where we can learn together!");
                    }
                } else if(currentQuestion == quizQuestions.size()  )
                {
                    //TODO fix this --> go to registration after giving quiz score results

                    Intent intent = new Intent(this, RegistrationActivity.class);
                    startActivity(intent);
                }
                else {
                    ++currentQuestion;
                    setQuestion();
                }
            }
        });
    }

    private void setQuestion() {
        question.setText(quizQuestions.get(currentQuestion).text);
        for (int i = 0; i < quizQuestions.get(currentQuestion).answers.length; ++i) {
            answerViews[i].setText(quizQuestions.get(currentQuestion).answers[i].text);
            if (quizQuestions.get(currentQuestion).answers.length == 3) {
                answerViews[3].setVisibility(View.GONE);
            } else {
                answerViews[3].setVisibility(View.VISIBLE);
            }
        }
        if (currentQuestion == quizQuestions.size()-1) {
            nextQuestionButton.setText(getResources().getString(R.string.CompleteQuizButton));
        }
    }

    private void populateQuestions() {
        quizQuestions.add(new Question(0, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I communicate in a straightforward manner - I talk directly with a person when I have a problem with them", 2),
                        new Answer(2, " I communicate in an indirect manner - I keep it to myself when I have a problem with a person ", 1),
                        new Answer(3, " I don’t talk to the person I have a problem with and instead talk about them behind their backs",  0),
                }
        ));
        quizQuestions.add(new Question(1, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I try to get my point across in the most straightforward and simple manner", 2),
                        new Answer(2, " I over complicate things ", 1),
                        new Answer(3, " I don’t even bother to explain things to other people", 0),
                }
        ));
        quizQuestions.add(new Question(2, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " People often misunderstand what I say", 0),
                        new Answer(2, " I have a hard time saying what I mean ", 1),
                        new Answer(3, " I don’t have problems with getting my ideas across", 2),
                }
        ));
        quizQuestions.add(new Question(3, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " When I don’t understand what the other person is saying I don’t have a hard time asking for an explanation", 2),
                        new Answer(2, " When I don’t understand what the other person is saying I don’t ask for an explanation ", 1),
                        new Answer(3, " When I don’t understand what the other person is saying I stop talking to them", 0),
                        new Answer(4, " When I don’t understand what the other person is saying I assume what they mean without consulting with them", 0),
                }
        ));
        quizQuestions.add(new Question(4, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I can understand when other people have misunderstood what I have said", 2),
                        new Answer(2, " I struggle to figure out when others have misunderstood my speech ", 1),
                        new Answer(3, " I never bother to think whether the other person understands me and proceed to talk", 0),
                }
        ));
        quizQuestions.add(new Question(5, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I try to understand other people’s point of view", 2),
                        new Answer(2, " I fail to see it from other’s point of view ", 1),
                        new Answer(3, " I get into an argument with the person because I don’t agree with their point of view", 0),
                }
        ));
        quizQuestions.add(new Question(6, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I am very worried I will say something stupid so I prefer to remain silent rather than hurting people with my ignorance", 1),
                        new Answer(2, " I know that it’s only normal to make mistakes when you’re thinking on the spot so i don’t beat myself over it but I also consider how my words may affect others", 2),
                        new Answer(3, " I say whatever whenever", 0),
                }
        ));
        quizQuestions.add(new Question(7, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I have a very expressive face - I wear my emotions on my sleeve", 1),
                        new Answer(2, " My facial expression never gives away what I am thinking or feeling ", 0),
                        new Answer(3, " I use some body language but I am sloppy with it - for example I have no idea what to do with my hands", 1),
                        new Answer(4, " I show my emotions in proportional amounts", 2),
                }
        ));
        quizQuestions.add(new Question(8, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " I go into lengthy explanations", 1),
                        new Answer(2, " I get my point across briefly ", 1),
                        new Answer(3, " I never try to explain anything", 0),
                        new Answer(4, " I can both speak at length and in short depending on the situation", 2),
                }
        ));
        quizQuestions.add(new Question(9, "Which one sounds more like you?",
                new Answer[]{
                        new Answer(1, " People often misunderstand what I say", 1),
                        new Answer(2, " I have a hard time saying what I mean ", 0),
                        new Answer(3, " I don’t have problems with getting my ideas across", 2),
                }
        ));
    }
}


