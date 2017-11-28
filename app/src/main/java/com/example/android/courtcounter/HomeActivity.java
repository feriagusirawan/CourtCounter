package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore;
    int teamBScore;

    /**
     * When the 3 points clicked
     */
    public void threePoints (View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    /**
     * When the 2 points clicked
     */
    public void twoPoints (View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * When the 1 point clicked
     */
    public void onePoint (View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * When the 3 points clicked
     */
    public void threePointsB (View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    /**
     * When the 2 points clicked
     */
    public void twoPointsB (View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    /**
     * When the 1 point clicked
     */
    public void onePointB (View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    /**
     * When the reset button clicked
     */
    public void reset (View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
