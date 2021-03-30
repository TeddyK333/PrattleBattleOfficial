package com.example.prattlebattle.model;

public class Question{
    int number;
    String text;
    Answer[] answers;

    public Question(int number, String text, Answer[] answers) {
        this.number = number;
        this.text = text;
        this.answers = answers;
    }
}
