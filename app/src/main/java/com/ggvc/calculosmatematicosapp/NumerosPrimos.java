package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {
     EditText edNum;
     TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);
        edNum = findViewById(R.id.txtnum);
        tvResult = findViewById(R.id.txtresult);

        Button btnVerify = findViewById(R.id.btnveryfi);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarNumeroPrimo();
            }
        });

        Button btnVolver = findViewById(R.id.btnvolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volverAlMenuPrincipal();
            }
        });
    }

    private void verificarNumeroPrimo() {
        String input = edNum.getText().toString();
        if (!input.isEmpty()) {
            int numero = Integer.parseInt(input);
            boolean esNumeroPrimo = esPrimo(numero);
            String mensaje = esNumeroPrimo ? "Es primo" : "No es primo";
            tvResult.setText(mensaje);
        } else {
            tvResult.setText("Ingresa un número");
        }
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    private void volverAlMenuPrincipal() {
        Intent intent = new Intent(NumerosPrimos.this, MenuOperaciones.class);
        startActivity(intent);
        finish();
    }
    }
