package com.example.prattlebattle.model;

public class PracticeScenario {
    public String title;
    public String text;
    public PracticeAction[] actions;
    public boolean isCompleted;

    public PracticeScenario(String title, String text, PracticeAction[] actions) {
        this.title = title;
        this.text = text;
        this.actions = actions;
    }
}
