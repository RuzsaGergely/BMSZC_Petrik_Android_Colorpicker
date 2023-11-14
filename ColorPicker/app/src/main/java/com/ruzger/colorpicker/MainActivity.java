package com.ruzger.colorpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private SeekBar seekBarRed;
    private SeekBar seekBarGreen;
    private SeekBar seekBarBlue;
    private TextView textViewRed;
    private TextView textViewGreen;
    private TextView textViewBlue;
    private TextView textViewOutput;
    private RelativeLayout relativeLayoutColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        redrawColor();
        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redrawColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }
        });

        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redrawColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }
        });

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redrawColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                redrawColor();
            }
        });

    }

    private void redrawColor() {
        textViewRed.setText(String.valueOf(seekBarRed.getProgress()));
        textViewBlue.setText(String.valueOf(seekBarBlue.getProgress()));
        textViewGreen.setText(String.valueOf(seekBarGreen.getProgress()));
        textViewOutput.setText("(" + String.valueOf(seekBarRed.getProgress()) + ", " + String.valueOf(seekBarGreen.getProgress()) + ", " + String.valueOf(seekBarBlue.getProgress()) + ")");
        relativeLayoutColor.setBackgroundColor(Color.rgb(seekBarRed.getProgress(), seekBarGreen.getProgress(), seekBarBlue.getProgress()));
        if(seekBarRed.getProgress() + seekBarGreen.getProgress() + seekBarBlue.getProgress() > 384){
            textViewOutput.setTextColor(Color.BLACK);
        } else {
            textViewOutput.setTextColor(Color.WHITE);
        }
    }

    private void init() {
        constraintLayout = findViewById(R.id.constraintLayout);
        relativeLayoutColor = findViewById(R.id.relativeLayoutColor);
        seekBarBlue = findViewById(R.id.seekBarBlue);
        seekBarRed = findViewById(R.id.seekBarRed);
        seekBarGreen = findViewById(R.id.seekBarGreen);
        textViewRed = findViewById(R.id.textViewRed);
        textViewBlue = findViewById(R.id.textViewBlue);
        textViewGreen = findViewById(R.id.textViewGreen);
        textViewOutput = findViewById(R.id.textViewOutput);

        Random rnd = new Random();

        seekBarBlue.setProgress(rnd.nextInt(256));
        seekBarRed.setProgress(rnd.nextInt(256));
        seekBarGreen.setProgress(rnd.nextInt(256));

    }
}