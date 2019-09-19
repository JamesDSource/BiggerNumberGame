package com.example.biggernumbergame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.whichnumberishigher.BiggerNumberGame;

public class MainActivity extends AppCompatActivity {
    private int change = 10;
    private Button bOption1;
    private Button bOption2;
    private TextView tvPoints;
    private ConstraintLayout constraint;
    private int min = 0;
    private int max = 100;
    private int points = 0;
    private com.example.whichnumberishigher.BiggerNumberGame number_game = new BiggerNumberGame(min, max);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bOption1 = findViewById(R.id.bOption1);
        bOption2 = findViewById(R.id.bOption2);
        tvPoints = findViewById(R.id.tvPoints);
        constraint = findViewById(R.id.constraint);
        generate();
    }
    public void ClickFirstOption(View view){
        if(number_game.compareNumbers()){
            correct();
        }
        else{
            incorrect();
        }
    }
    public void ClickSecondOption(View view){
        if(number_game.compareNumbers()){
            incorrect();
        }
        else{
            Log.d("Game", "works");
            correct();
        }

    }
    public void generate(){
        number_game.generatRandomNumbers();
        bOption1.setText("" + number_game.getNumber1());
        bOption2.setText("" + number_game.getNumber2());
    }
    public void correct(){
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        points++;
        tvPoints.setText("" + points);
        number_game.setMax_numb(number_game.getMax_numb() + change);
        number_game.setMin_numb(number_game.getMin_numb() - change);
        constraint.setBackgroundColor(Color.rgb(0, 255, 0));
        generate();
    }
    public void incorrect(){
        Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        points--;
        tvPoints.setText("" + points);
        constraint.setBackgroundColor(Color.rgb(255, 0, 0));
        generate();
    }
}
