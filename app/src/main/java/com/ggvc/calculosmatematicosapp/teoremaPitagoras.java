package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class teoremaPitagoras extends AppCompatActivity {
    EditText ladoA,ladoB,ladoC;
    TextView resul;
    Button calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teorema_pitagoras);
        ladoA=findViewById(R.id.txtladoA);
        ladoB=findViewById(R.id.txtladoB);
        ladoC=findViewById(R.id.txtladoC);
        resul=findViewById(R.id.lblRes);
        calcular=findViewById(R.id.btnCalcular);


    }


    public  void calcula(View view){
        double a= Double.parseDouble(ladoA.getText().toString());
        double b= Double.parseDouble(ladoB.getText().toString());
        double c= Double.parseDouble(ladoC.getText().toString());

        if (c == 0) {

            c = calcularHipotenusa(a, b);
            resul.setText("La longitud de la hipotenusa es: " + c);


        } else {

            if (verificarTeoremaPitagoras(a, b, c)) {
                resul.setText("Las longitudes proporcionadas cumplen con el teorema de Pitágoras.");

            } else {
                resul.setText("Las longitudes proporcionadas no cumplen con el teorema de Pitágoras.");

            }
        }





    }



    public static double calcularHipotenusa(double ladoA, double ladoB) {
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }


    public static double calcularLadoAdyacente(double ladoA, double hipotenusa) {
        return Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(ladoA, 2));
    }


    public static double calcularCatetoOpuesto(double ladoB, double hipotenusa) {
        return Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(ladoB, 2));
    }

    public static boolean verificarTeoremaPitagoras(double ladoA, double ladoB, double hipotenusa) {
        return Math.pow(ladoA, 2) + Math.pow(ladoB, 2) == Math.pow(hipotenusa, 2);
    }



}