package com.example.proyectoseclipse.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyectoseclipse.R;

public class Calculadora extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSuma, bResta, bIgual, bMulti, bPorcentaje, bMm, bParentesis, bPunto, bC;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bSuma = findViewById(R.id.bSuma);
        bResta = findViewById(R.id.bResta);
        bMm = findViewById(R.id.bMm);
        bPorcentaje=findViewById(R.id.bPorcentaje);
        bIgual = findViewById(R.id.bIgual);
        bMulti = findViewById(R.id.bMulti);
        bParentesis = findViewById(R.id.bParentesis);
        bC = findViewById(R.id.bC);
        bPunto = findViewById(R.id.bPunto);

        resultado = findViewById(R.id.resultado);

        bIgual.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        resultado.setText(botonPush(b1));

                    }
                }
        );



    }

    public int botonPush(View v){
        int contador = 0;
        switch (v.getId()) {
            case R.id.b0:
                int acum = Integer.parseInt((String) b0.getText());
                int acum1 = acum;
        }
    }


}