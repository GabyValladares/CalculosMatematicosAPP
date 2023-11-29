package com.ggvc.calculosmatematicosapp;
// ExponencialesActivity.java

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class exponenciales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exponenciales);

        final EditText edtBase = findViewById(R.id.edtBase);
        final EditText edtExponente = findViewById(R.id.edtExponente);
        final TextView txtResultado = findViewById(R.id.txtResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Realizar la operación de exponenciación y mostrar el resultado en txtResultado
                try {
                    int base = Integer.parseInt(edtBase.getText().toString());
                    int exponente = Integer.parseInt(edtExponente.getText().toString());
                    double resultado = Math.pow(base, exponente);
                    txtResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException e) {
                    txtResultado.setText("Ingrese números válidos");
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Regresar a la actividad anterior
            }
        });
    }
}
