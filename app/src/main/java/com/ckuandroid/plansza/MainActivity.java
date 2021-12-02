package com.ckuandroid.plansza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String znak ="X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void przycisk(View view) {
        Button przycisk = (Button) view;
        przycisk.setText(znak);
        if(znak.equals("X")) znak="O";
        else znak="X";
        przycisk.setEnabled(false);
    }
}