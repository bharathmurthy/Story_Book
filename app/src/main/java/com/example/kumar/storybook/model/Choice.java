package com.example.kumar.storybook.model;

/**
 * Created by kumar on 2/20/2015.
 */
public class Choice {
    private String mText;
    private int mNextChoice;
    public Choice(String text,int choice){
        mText=text;
        mNextChoice=choice;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextChoice() {
        return mNextChoice;
    }

    public void setChoice(int choice) {
        mNextChoice = choice;
    }
}
