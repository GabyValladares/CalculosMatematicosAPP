package com.ggvc.calculosmatematicosapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySumar extends AppCompatActivity {

    private EditText edNum1;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        edNum1 = findViewById(R.id.edNum1);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnVerificar = findViewById(R.id.btnDividir);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarNumeroPerfecto();
            }
        });
    }

    private void verificarNumeroPerfecto() {
        try {
            int num = Integer.parseInt(edNum1.getText().toString());
            boolean esPerfecto = esNumeroPerfecto(num);

            if (esPerfecto) {
                tvResultado.setText("El número " + num + " es perfecto.");
            } else {
                tvResultado.setText("El número " + num + " no es perfecto.");
            }

        } catch (NumberFormatException e) {
            tvResultado.setText("Ingrese un número válido.");
        }
    }

    private boolean esNumeroPerfecto(int num) {
        if (num <= 1) {
            return false;
        }

        int sumaDivisores = 1; // 1 siempre es divisor

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumaDivisores += i;
                if (i != num / i) {
                    sumaDivisores += num / i;
                }
            }
        }

        return sumaDivisores == num;
    }
}


