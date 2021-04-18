package com.example.prattlebattle.model;

public class PracticeScenario {
    public String title;
    public String text;
    public int image;
    public PracticeAction[] actions;
    public boolean isCompleted;

    public PracticeScenario(String title, String text, int image, PracticeAction[] actions) {
        this.title = title;
        this.text = text;
        this.image = image;
        this.actions = actions;

    }
}
