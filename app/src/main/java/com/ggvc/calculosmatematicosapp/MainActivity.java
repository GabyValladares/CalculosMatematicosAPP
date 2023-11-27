package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ladoA,ladoB,ladoC;
    TextView resul;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ladoA=findViewById(R.id.txtladoA2);
        ladoB=findViewById(R.id.txtladoB2);
        ladoC=findViewById(R.id.txtladoC2);
        resul=findViewById(R.id.lblResultado2);
        calcular=findViewById(R.id.btnCalcula);
    }

    public void calcula(View view) {
        String ladoAText = ladoA.getText().toString().trim();
        String ladoBText = ladoB.getText().toString().trim();
        String ladoCText = ladoC.getText().toString().trim();

        if (ladoAText.isEmpty() && ladoBText.isEmpty() && ladoCText.isEmpty()) {
            resul.setText("Por favor, ingrese al menos un valor en uno de los campos.");
            return;
        }

        double a = ladoAText.isEmpty() ? 0 : Double.parseDouble(ladoAText);
        double b = ladoBText.isEmpty() ? 0 : Double.parseDouble(ladoBText);
        double c = ladoCText.isEmpty() ? 0 : Double.parseDouble(ladoCText);

        if (c == 0) {
            if (a != 0 && b != 0) {
                c = calcularHipotenusa(a, b);
                resul.setText("La longitud de la hipotenusa es: " + c);
            } else {
                resul.setText("Por favor, ingrese al menos dos valores para calcular la hipotenusa.");
            }
        } else {
            if (a == 0) {
                double ladoA = calcularCatetoOpuesto(b, c);
                resul.setText("La longitud del cateto opuesto es: " + ladoA);
            } else if (b == 0) {
                double ladoB = calcularLadoAdyacente(a, c);
                resul.setText("La longitud del cateto adyacente es: " + ladoB);
            } else if (verificarTeoremaPitagoras(a, b, c)) {
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