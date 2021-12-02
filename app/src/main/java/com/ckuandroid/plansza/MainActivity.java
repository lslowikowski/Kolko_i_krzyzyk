package com.ckuandroid.plansza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String znak ="X";
    int licznik = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void przycisk(View view) {
        TextView wynik = (TextView) findViewById(R.id.wynik);
        Button przycisk = (Button) view;
        przycisk.setText(znak);
        licznik ++;
        if(sprawdzWygrana()){
            wynik.setText("Wygrywa: " + znak + "!!!");
        }
        if(licznik==9){
            wynik.setText("Remis !!!");
        }
        if(znak.equals("X")) znak="O";
        else znak="X";
        przycisk.setEnabled(false);
    }

    public boolean sprawdzWygrana(){
        boolean wygrana = false;
        Button p11 = (Button) findViewById(R.id.pole_1_1);
        Button p12 = (Button) findViewById(R.id.pole_1_2);
        Button p13 = (Button) findViewById(R.id.pole_1_3);

        Button p21 = (Button) findViewById(R.id.pole_2_1);
        Button p22 = (Button) findViewById(R.id.pole_2_2);
        Button p23 = (Button) findViewById(R.id.pole_2_3);

        Button p31 = (Button) findViewById(R.id.pole_3_1);
        Button p32 = (Button) findViewById(R.id.pole_3_2);
        Button p33 = (Button) findViewById(R.id.pole_3_3);

        String p11s = p11.getText().toString();
        String p12s = p12.getText().toString();
        String p13s = p13.getText().toString();

        String p21s = p21.getText().toString();
        String p22s = p22.getText().toString();
        String p23s = p23.getText().toString();

        String p31s = p31.getText().toString();
        String p32s = p32.getText().toString();
        String p33s = p33.getText().toString();

        if(p11s.equals(p12s) && p11s.equals(p13s) && p11s.length()>0 ||
           p21s.equals(p22s) && p21s.equals(p23s) && p21s.length()>0 ||
           p31s.equals(p32s) && p31s.equals(p33s) && p31s.length()>0 ||

           p11s.equals(p21s) && p11s.equals(p31s) && p11s.length()>0 ||
           p12s.equals(p22s) && p12s.equals(p32s) && p12s.length()>0 ||
           p13s.equals(p23s) && p13s.equals(p33s) && p13s.length()>0 ||

           p11s.equals(p22s) && p11s.equals(p33s) && p11s.length()>0 ||
           p13s.equals(p22s) && p13s.equals(p31s) && p13s.length()>0
        ) wygrana = true;
        return wygrana;

    }
}