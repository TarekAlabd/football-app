package com.example.android.footballapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballapp.R;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int foulTeamA = 0;
    int outTeamA = 0;
    int goalTeamB = 0;
    int foulTeamB = 0;
    int outTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the goal for Team A.
     */
    public void PgoalTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayGForTeamA(goalTeamA);
    }

    /**
     * Decrease the goal for Team A.
     */
    public void MgoalTeamA(View v) {
        goalTeamA = goalTeamA - 1;
        displayGForTeamA(goalTeamA);
    }

    /**
     * Increase the foul for Team A.
     */
    public void PfoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFForTeamA(foulTeamA);
    }

    /**
     * Decrease the foul for Team A.
     */
    public void MfoulTeamA(View v) {
        foulTeamA = foulTeamA - 1;
        displayFForTeamA(foulTeamA);
    }

    /**
     * Increase the out for Team A.
     */
    public void PoutTeamA(View v) {
        outTeamA = outTeamA + 1;
        displayOForTeamA(outTeamA);
    }

    /**
     * Decrease the out for Team A.
     */
    public void MoutTeamA(View v) {
        outTeamA = outTeamA - 1;
        displayOForTeamA(outTeamA);
    }

    /**
     * Increase the goal for Team B.
     */
    public void PgoalTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayGForTeamB(goalTeamB);
    }

    /**
     * Decrease the goal for Team B.
     */
    public void MgoalTeamB(View v) {
        goalTeamB = goalTeamB - 1;
        displayGForTeamB(goalTeamB);
    }

    /**
     * Increase the foul for Team B.
     */
    public void PfoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFForTeamB(foulTeamB);
    }

    /**
     * Decrease the foul for Team B.
     */
    public void MfoulTeamB(View v) {
        foulTeamB = foulTeamB - 1;
        displayFForTeamB(foulTeamB);
    }

    /**
     * Increase the out for Team B.
     */
    public void PoutTeamB(View v) {
        outTeamB = outTeamB + 1;
        displayOForTeamB(outTeamB);
    }

    /**
     * Decrease the out for Team B.
     */
    public void MoutTeamB(View v) {
        outTeamB = outTeamB - 1;
        displayOForTeamB(outTeamB);
    }

    /**
     * make the reset button 0.
     */
    public void makeResetBtn0 (View v){
        goalTeamA = 0;
        foulTeamA = 0;
        outTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        outTeamB = 0;
        displayGForTeamA(goalTeamA);
        displayFForTeamA(foulTeamA);
        displayOForTeamA(outTeamA);
        displayGForTeamB(goalTeamB);
        displayFForTeamB(foulTeamB);
        displayOForTeamB(outTeamB);
    }
    /**
     * Displays the given goal for Team A.
     */
    public void displayGForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_goalsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_foulsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team A.
     */
    public void displayOForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_outsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Team B.
     */
    public void displayGForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_goalsB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayFForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_foulsB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team B.
     */
    public void displayOForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.change_outsB);
        scoreView.setText(String.valueOf(score));
    }


}