package com.example.prattlebattle.model;

public class PracticeAction {
    public String text;
    public String hint;
    public boolean isCorrect;
    public Integer nextScenario;

    public PracticeAction(String text, String hint, boolean isCorrect, Integer nextScenarioNumber) {
        this.text = text;
        this.hint = hint;
        this.isCorrect = isCorrect;
        this.nextScenario = nextScenarioNumber;
    }
}
