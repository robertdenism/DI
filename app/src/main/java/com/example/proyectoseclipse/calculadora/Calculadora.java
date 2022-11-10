package com.example.proyectoseclipse.calculadora;

import static java.lang.Float.parseFloat;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectoseclipse.R;

public class Calculadora extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSuma, bResta, bIgual, bMulti, bPorcentaje, bMm, bParentesis, bPunto, bC;
    TextView resultado;

    float numero1=0.0f;
    float numero2=0.0f;

    String operacion="";

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
        bPorcentaje = findViewById(R.id.bPorcentaje);
        bIgual = findViewById(R.id.bIgual);
        bMulti = findViewById(R.id.bMulti);
        bParentesis = findViewById(R.id.bParentesis);
        bC = findViewById(R.id.bC);
        bPunto = findViewById(R.id.bPunto);

        resultado = findViewById(R.id.resultado);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("0");
                    } else {
                        resultado.setText(resultado.getText() + "0");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("0");
                    } else {
                        resultado.setText(resultado.getText() + "0");
                    }
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("1");
                    } else {
                        resultado.setText(resultado.getText() + "1");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("1");
                    } else {
                        resultado.setText(resultado.getText() + "1");
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("2");
                    } else {
                        resultado.setText(resultado.getText() + "2");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("2");
                    } else {
                        resultado.setText(resultado.getText() + "2");
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("3");
                    } else {
                        resultado.setText(resultado.getText() + "3");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("3");
                    } else {
                        resultado.setText(resultado.getText() + "3");
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("4");
                    } else {
                        resultado.setText(resultado.getText() + "4");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("4");
                    } else {
                        resultado.setText(resultado.getText() + "4");
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("5");
                    } else {
                        resultado.setText(resultado.getText() + "5");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("5");
                    } else {
                        resultado.setText(resultado.getText() + "5");
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("6");
                    } else {
                        resultado.setText(resultado.getText() + "6");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("6");
                    } else {
                        resultado.setText(resultado.getText() + "6");
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("7");
                    } else {
                        resultado.setText(resultado.getText() + "7");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("7");
                    } else {
                        resultado.setText(resultado.getText() + "7");
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("8");
                    } else {
                        resultado.setText(resultado.getText() + "8");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("8");
                    } else {
                        resultado.setText(resultado.getText() + "8");
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion.equals("")) {
                    numero1 = Float.parseFloat(resultado.getText().toString());
                    if (numero1 == 0.0f) {
                        resultado.setText("9");
                    } else {
                        resultado.setText(resultado.getText() + "9");
                    }
                } else {
                    numero2 = Float.parseFloat(resultado.getText().toString());
                    if (numero2 == 0.0f) {
                        resultado.setText("9");
                    } else {
                        resultado.setText(resultado.getText() + "9");
                    }
                }
            }
        });
        bSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = parseFloat(resultado.getText().toString());
                operacion="+";
                resultado.setText("0");
            }
        });

        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = parseFloat(resultado.getText().toString());
                operacion="-";
                resultado.setText("0");
            }
        });
        bPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = parseFloat(resultado.getText().toString());
                operacion="/";
                resultado.setText("0");
            }
        });

        bMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = parseFloat(resultado.getText().toString());
                operacion="*";
                resultado.setText("0");
            }
        });



        bMm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = parseFloat(resultado.getText().toString());
                operacion="E";
                resultado.setText("0");
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");
                numero1 = 0.0f;
                numero2 = 0.0f;
                operacion = "";
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2 = Float.parseFloat(resultado.getText().toString());
                if(operacion.equals("+")){
                    float result = numero1+numero2;
                    resultado.setText(result+"");
                }else if(operacion.equals("-")){
                    float result = numero1-numero2;
                    resultado.setText(result+"");

                }else if(operacion.equals("*")) {
                    float result = numero1 * numero2;
                    resultado.setText(result + "");

                }else if(operacion.equals("/")) {
                    if (numero2 == 0.0f) {
                        resultado.setText("0");
                        mensaje();
                        //Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
                    } else {
                        float result = (numero1 / numero2);
                        resultado.setText(result + "");
                    }
                }else if(operacion.equals("E")){
                    float result = (float) Math.pow(numero1,numero2);
                        resultado.setText(result+"");
                }
                numero1 = 0.0f;
                numero2 = 0.0f;
                operacion = "";
            }

        });
    }
    public void mensaje(){
        Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
    }
}

