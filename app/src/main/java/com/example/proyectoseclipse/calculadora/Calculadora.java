package com.example.proyectoseclipse.calculadora;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyectoseclipse.R;

public class Calculadora extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSuma, bResta, bIgual, bMulti, bPorcentaje, bMm, bParentesis, bPunto, bC;
    TextView resultado;

    float numero1=0.0f;
    float numero2=0.0f;

    String operacion ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

      /*  b0 = findViewById(R.id.b0);
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
        bPunto = findViewById(R.id.bPunto);*/

        resultado = findViewById(R.id.resultado);


    }


    public void EscribirSiete(View view) {
        numero1 = parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f){
            resultado.setText("7");
        }else{
            resultado.setText(resultado.getText() + "7");
        }

    }

    public void escribirOcho(View view) {
        numero1 = parseFloat(resultado.getText().toString());
        if(numero1 == 0.0f){
            resultado.setText("8");
        }else{
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void escribir9(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("9");
        }else{
            resultado.setText(resultado.getText() + "9");
        }
    }



    public void escribir6(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("6");
       }else{
            resultado.setText(resultado.getText() + "6");
        }
    }

    public void escribir0(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("0");
        }else{
            resultado.setText(resultado.getText() + "0");
        }
    }

    public void escibir5(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("5");
        }else{
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void escibir3(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("3");
        }else{
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void escribir2(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("2");
        }else{
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void escribir1(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("1");
        }else{
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void escribir4(View view) {
        numero1 =  parseFloat(resultado.getText().toString());
        if (numero1 == 0){
            resultado.setText("4");
        }else{
            resultado.setText(resultado.getText() + "4");
        }
    }


    public void limpiar(View view) {
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;

    }
}