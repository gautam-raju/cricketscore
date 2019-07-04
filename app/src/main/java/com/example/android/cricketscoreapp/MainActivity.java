package com.example.android.cricketscoreapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity
{
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        int wicketsA = 0;
        int wicketsB = 0;
        double oversA = 0;
        int oversA1 = 0;
        double oversA2 = 0.0;
        double oversB = 0;
        int oversB1 = 0;
        double oversB2 = 0.0;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


         @Override
         public boolean onCreateOptionsMenu(Menu menu)
         {
            //Inflate the menu;this adds item to the action bar if it is present
             getMenuInflater().inflate(R.menu.menu_main,menu);
             return true;
         }
         @Override
         public boolean onOptionsItemSelected(MenuItem item) {
             // Handle action bar item clicks here. The action bar will
             // automatically handle clicks on the Home/Up button, so long
             // as you specify a parent activity in AndroidManifest.xml.
             int id = item.getItemId();

             //noinspection SimplifiableIfStatement
             if (id == R.id.action_settings) {
                 return true;
             }

             return super.onOptionsItemSelected(item);
         }
         public void addoneForTeamA(View v) {
             scoreTeamA = scoreTeamA + 1;
             displayForTeamA(scoreTeamA);
         }
         public void addtwoForTeamA(View v) {
             scoreTeamA = scoreTeamA + 2;
             displayForTeamA(scoreTeamA);
         }
         public void addthreeForTeamA(View v) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
         }
         public void addfourForTeamA(View v) {
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
         }
         public void addsixForTeamA(View v) {
            scoreTeamA = scoreTeamA + 6;
            displayForTeamA(scoreTeamA);
         }
         public void countWicketsA(View w) {
            wicketsA = wicketsA + 1;
            displaywicketsForTeamA(wicketsA);
         }
         public void countOversA(View v){
            oversA2=oversA2 +0.1;
            if(oversA2==0.6)
            {
                oversA1=oversA1+1;
                oversA2=0.0;
            }
            oversA=oversA1+oversA2;
            displayoversForTeamA(oversA);
         }
         public void addoneForTeamB(View v) {
            scoreTeamB =scoreTeamB +1;
            displayForTeamB(scoreTeamB);
         }
         public void addtwoForTeamB(View v) {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
         }
         public void addthreeForTeamB(View v) {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
         }
         public void addfourForTeamB(View v) {
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB);
         }
         public void addsixForTeamB(View v) {
            scoreTeamB = scoreTeamB + 6;
            displayForTeamB(scoreTeamB);
         }
         public void countWicketsB(View w){
             wicketsB = wicketsB + 1;
             displaywicketsForTeamB(wicketsB);
         }
         public void countOversB(View v){
             oversB2=oversB2 +0.1;
             if(oversB2==0.6)
             {
                oversB1=oversB1+1;
                oversB2=0.0;
             }
             oversB=oversB1+oversB2;
             displayoversForTeamB(oversB);
         }
         public void resetScore(View v){
             scoreTeamA = 0;
             scoreTeamB = 0;
             wicketsA = 0;
             wicketsB = 0;
             oversA=0;
             oversA2=0;
             oversA1=0;
             oversB=0;
             oversB2=0;
             oversB1=0;
             displayForTeamA(scoreTeamA);
             displayForTeamB(scoreTeamB);
             displaywicketsForTeamA(wicketsA);
             displaywicketsForTeamB(wicketsB);
             displayoversForTeamA(oversA);
             displayoversForTeamB(oversB);
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
    /**
     * Displays the wickets gone for Team A.
     */
    public void displaywicketsForTeamA(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.showWicketsA);
        scoreView.setText(String.valueOf(wickets));
    }
    /**
     * Displays the overs for Team A.
     */
    public void displayoversForTeamA(double overs) {
        TextView oversView = (TextView) findViewById(R.id.showOversA);
        oversView.setText(String.valueOf(truncateDecimal(overs,1)));
    }
    /**
     * Displays the overs for Team A.
     */
    public void displayoversForTeamB(double overs) {
        TextView oversView = (TextView) findViewById(R.id.showOversB);
        oversView.setText(String.valueOf(truncateDecimal(overs,1)));
    }
    /**
     * Displays the wickets gone for Team B.
     */
    public void displaywicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showWicketsB);
        scoreView.setText(String.valueOf(score));
    }

    private  static BigDecimal truncateDecimal(double x, int numberofdecimal){
        if(x > 0){
            return new BigDecimal(String.valueOf(x)).setScale(numberofdecimal, BigDecimal.ROUND_FLOOR);
        }
        else{
            return new BigDecimal(String.valueOf(x)).setScale(numberofdecimal, BigDecimal.ROUND_CEILING);

        }
    }

}


