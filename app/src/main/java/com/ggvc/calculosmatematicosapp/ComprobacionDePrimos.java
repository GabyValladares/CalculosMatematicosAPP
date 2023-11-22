package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComprobacionDePrimos extends AppCompatActivity {

    private EditText txtNumero;
    private Button button;
    private TextView lblRespuesta, lblRespuestaSuma, lblRespuestaRaizCuadrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobacion_de_primos);

        txtNumero = findViewById(R.id.txtNumero);
        button = findViewById(R.id.button);
        lblRespuesta = findViewById(R.id.lblRespuesta);
        lblRespuestaSuma = findViewById(R.id.lblRespuestaSuma);
        lblRespuestaRaizCuadrada = findViewById(R.id.lblRespuesta3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobarNumerosPrimos();
            }
        });
    }

    private void comprobarNumerosPrimos() {
        String numeroStr = txtNumero.getText().toString();

        if (!numeroStr.isEmpty()) {

                int numero = Integer.parseInt(numeroStr);

                mostrarNumerosPrimos(numero);

                int suma = calcularSuma(numero);
                lblRespuestaSuma.setText("Suma: " + suma);

                double raizCuadrada = calcularRaizCuadrada(numero);
                lblRespuestaRaizCuadrada.setText("Raíz Cuadrada: " + raizCuadrada);


        } else {
            lblRespuesta.setText("ingrese un número.");
        }
    }

    private void mostrarNumerosPrimos(int numero) {
        StringBuilder resultado = new StringBuilder("Números primos menores que " + numero + ":\n");

        for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                resultado.append(i).append(" ");
            }
        }

        lblRespuesta.setText(resultado.toString());
    }

    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private int calcularSuma(int numero) {
        int sumaPrimos = 0;

        for (int i = 2; i <= numero; i++) {
            if (esPrimo(i)) {
                sumaPrimos += i;
            }
        }

        return sumaPrimos;
    }
    private double calcularRaizCuadrada(int numero) {
        return Math.sqrt(numero);
    }
}