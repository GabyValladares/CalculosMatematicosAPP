package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainNumerosPerfectos extends AppCompatActivity {

    private EditText edNum1;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_perfectos);

        edNum1 = findViewById(R.id.edNum1);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnVerificar = findViewById(R.id.btnDividir);
        Button btnVolverMenu = findViewById(R.id.btnVolverMenu); // Agrega esta línea

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarNumeroPerfecto();
            }
        });

        btnVolverMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volverAlMenu();
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

    private void volverAlMenu() {
        // Aquí implementa el código para volver al activity MenuOperaciones
        // Puedes utilizar un Intent para iniciar la actividad MenuOperaciones
        Intent intent = new Intent(MainNumerosPerfectos.this, MenuOperaciones.class);
        startActivity(intent);
        // Puedes finalizar la actividad actual si no necesitas volver a ella
        finish();
    }
}
