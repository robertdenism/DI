package com.example.proyectoseclipse.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoseclipse.R;

public class Calculadora extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}