package com.example.prattlebattle.model;

import android.text.TextWatcher;

import com.example.prattlebattle.RegistrationActivity;

public abstract class AgeLimit implements TextWatcher {

    int min, max;
    public AgeLimit(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }


}
