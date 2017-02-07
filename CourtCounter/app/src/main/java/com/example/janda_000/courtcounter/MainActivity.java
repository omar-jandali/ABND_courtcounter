package com.example.janda_000.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homePoints = 0;
    int awayPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsHome(View view){
        homePoints = homePoints + 3;
        displayForHomeTeam(homePoints);
    }

    public void addTwoPointsHome(View view){
        homePoints = homePoints + 2;
        displayForHomeTeam(homePoints);
    }

    public void addFreeThrowHome(View view){
        homePoints = homePoints + 1;
        displayForHomeTeam(homePoints);
    }

    public void addThreePointsAway(View view){
        awayPoints = awayPoints + 3;
        displayForAwayTeam(awayPoints);
    }

    public void addTwoPointsAway(View view){
        awayPoints = awayPoints + 2;
        displayForAwayTeam(awayPoints);
    }

    public void addFreeThrowAway(View view){
        awayPoints = awayPoints + 1;
        displayForAwayTeam(awayPoints);
    }

    public void resetScore(View view){
        homePoints = 0;
        awayPoints = 0;
        displayForHomeTeam(homePoints);
        displayForAwayTeam(awayPoints);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }
}
