package com.example.zgadnijliczbe;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.ThreadLocalRandom;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int prawidlowa;
    int Liczba;
    int liczbaPodejsc = 0;
    public void nowaGra(View view) {
        TextView wynik = (TextView) findViewById(R.id.wynik);
        TextView podejsca = (TextView) findViewById(R.id.podejsca);
        EditText liczba = (EditText) findViewById(R.id.editText);
        prawidlowa = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        liczbaPodejsc = 0;
        podejsca.setText("Liczba podejść: "+liczbaPodejsc);
        wynik.setText("Wynik");
        liczba.setText("");
    }
    public void sprawdz(View view) {
        TextView wynik = (TextView) findViewById(R.id.wynik);
        TextView podejsca = (TextView) findViewById(R.id.podejsca);
        try {
            EditText liczba = (EditText) findViewById(R.id.editText);
            liczbaPodejsc++;
            podejsca.setText("Liczba podejść: " + liczbaPodejsc);
            Liczba = Integer.parseInt(liczba.getText().toString());
            if (Liczba > prawidlowa) {
                wynik.setText("!Za dużo!");
            } else if (Liczba < prawidlowa) {
                wynik.setText("!Za mało!");
            } else {
                wynik.setText("!Brawo zgadłeś!");
            }
        }catch (NumberFormatException exc){
            wynik.setText("!Wprowadź liczbę!");
        }
    }


}