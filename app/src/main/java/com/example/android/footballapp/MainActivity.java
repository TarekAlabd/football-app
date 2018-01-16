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
    TextView goalView1;
    TextView foulView1;
    TextView outView1;
    TextView goalView2;
    TextView foulView2;
    TextView outView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goalView1 = (TextView) findViewById(R.id.change_goalsA);
        foulView1 = (TextView) findViewById(R.id.change_foulsA);
        outView1 = (TextView) findViewById(R.id.change_outsA);
        goalView2 = (TextView) findViewById(R.id.change_goalsB);
        foulView2 = (TextView) findViewById(R.id.change_foulsB);
        outView2 = (TextView) findViewById(R.id.change_outsB);
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

        goalView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFForTeamA(int score) {

        foulView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team A.
     */
    public void displayOForTeamA(int score) {

        outView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Team B.
     */
    public void displayGForTeamB(int score) {
        goalView2.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayFForTeamB(int score) {
        foulView2.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team B.
     */
    public void displayOForTeamB(int score) {
        outView2.setText(String.valueOf(score));
    }


}