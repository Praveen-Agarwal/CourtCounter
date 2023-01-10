package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3pointsA(View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void add2pointsA(View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void add1pointA(View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void add3pointsB(View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void add2pointsB(View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void add1pointB(View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void reset(View view){
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

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}