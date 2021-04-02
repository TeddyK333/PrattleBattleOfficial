package com.example.prattlebattle.model;

public class Answer {
    public int number;
    public String text;
    public int score;
    public Boolean selected = false;

    public Answer(int number, String text, int score) {
        this.number = number;
        this.text = text;
        this.score = score;
    }
}

//class Second {
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}