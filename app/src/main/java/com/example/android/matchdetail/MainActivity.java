package com.example.android.matchdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int croatiaScore = 0;
    int nigeriaScore = 0;
    int croatiaAttempts = 0;
    int nigeriaAttempts = 0;
    int croatiaFouls = 0;
    int nigeriaFouls = 0;
    int croatiaPossession = 0;
    int nigeriaPossession = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayCroatiaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.croatia_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayNigeriaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addCroatiaScore(View v) {
        croatiaScore = croatiaScore + 1;
        displayCroatiaScore(croatiaScore);
    }

    public void minusCroatiaScore(View v) {
        croatiaScore = croatiaScore - 1;
        displayCroatiaScore(croatiaScore);
    }

    public void addNigeriaScore(View v) {
        nigeriaScore = nigeriaScore + 1;
        displayNigeriaScore(nigeriaScore);
    }

    public void minusNigeriaScore(View v) {
        nigeriaScore = nigeriaScore - 1;
        displayNigeriaScore(nigeriaScore);
    }

    public void displayCroatiaPossession(int possession) {
        TextView scoreView = (TextView) findViewById(R.id.croatia_possession);
        scoreView.setText(String.valueOf(possession));
    }

    public void displayNigeriaPossession(int possession) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_possession);
        scoreView.setText(String.valueOf(possession));
    }

    public void addCroatiaPossession(View v) {
        croatiaPossession = croatiaPossession + 5;
        displayCroatiaPossession(croatiaPossession);
    }

    public void subtractCroatiaPossession(View v) {
        croatiaPossession = croatiaPossession - 5;
        displayCroatiaPossession(croatiaPossession);
    }

    public void addNigeriaPossession(View v) {
        nigeriaPossession = nigeriaPossession + 5;
        displayNigeriaPossession(nigeriaPossession);
    }

    public void minusNigeriaPossession(View v) {
        nigeriaPossession = nigeriaPossession - 5;
        displayNigeriaPossession(nigeriaPossession);
    }

    public void displayCroatiaAttempts(int attempts) {
        TextView scoreView = (TextView) findViewById(R.id.croatia_attempts);
        scoreView.setText(String.valueOf(attempts));
    }

    public void displayNigeriaAttempts(int attempts) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_attempts);
        scoreView.setText(String.valueOf(attempts));
    }

    public void addCroatiaAttempts(View v) {
        croatiaAttempts = croatiaAttempts + 1;
        displayCroatiaAttempts(croatiaAttempts);
    }

    public void minusCroatiaAttempts(View v) {
        croatiaAttempts = croatiaAttempts - 1;
        displayCroatiaAttempts(croatiaAttempts);
    }

    public void addNigeriaAttempts(View v) {
        nigeriaAttempts = nigeriaAttempts + 1;
        displayNigeriaAttempts(nigeriaAttempts);
    }

    public void minusNigeriaAttempts(View v) {
        nigeriaAttempts = nigeriaAttempts - 1;
        displayNigeriaAttempts(nigeriaAttempts);
    }

    public void displayCroatiaFouls(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.croatia_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayNigeriaFouls(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void addCroatiaFouls(View v) {
        croatiaFouls = croatiaFouls + 1;
        displayCroatiaFouls(croatiaFouls);
    }

    public void minusCroatiaFouls(View v) {
        croatiaFouls = croatiaFouls - 1;
        displayCroatiaFouls(croatiaFouls);
    }

    public void addNigeriaFouls(View v) {
        nigeriaFouls = nigeriaFouls + 1;
        displayNigeriaFouls(nigeriaFouls);
    }

    public void minusNigeriaFouls(View v) {
        nigeriaFouls = nigeriaFouls - 1;
        displayNigeriaFouls(nigeriaFouls);
    }

    public void reset(View v) {
        displayCroatiaScore(croatiaScore = 0);
        displayNigeriaScore(nigeriaScore = 0);
        displayCroatiaPossession(croatiaPossession = 0);
        displayNigeriaPossession(nigeriaPossession = 0);
        displayCroatiaAttempts(croatiaAttempts = 0);
        displayNigeriaAttempts(nigeriaAttempts = 0);
        displayCroatiaFouls(croatiaFouls = 0);
        displayNigeriaFouls(nigeriaFouls = 0);
    }
}
