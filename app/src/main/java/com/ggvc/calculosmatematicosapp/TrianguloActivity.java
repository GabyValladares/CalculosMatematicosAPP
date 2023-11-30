package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrianguloActivity extends AppCompatActivity {

    EditText txtAltura, txtBase;
    Button btnEquilatero, btnIsoceles, btnEscaleno, btnRegresar;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        txtAltura = findViewById(R.id.txtAltura);
        txtBase =findViewById(R.id.txtBase);
        btnEquilatero = findViewById(R.id.btnEquilatero);
        btnEscaleno = findViewById(R.id.btnEscaleno);
        btnIsoceles = findViewById(R.id.btnIsoceles);
        btnRegresar = findViewById(R.id.btnRegresar);
        lblResultado = findViewById(R.id.lblResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public void CalcularEscaleno(View v) {
        String strBase = txtBase.getText().toString();
        String strAltura = txtAltura.getText().toString();

        if (strBase.isEmpty() || strAltura.isEmpty()) {
            mostrarToast("Llene todos los campos");
            return;
        }

        double base = Double.parseDouble(strBase);
        double altura = Double.parseDouble(strAltura);

        double resultado = (1 / 2) * base * altura;
        lblResultado.setText("El área del Triángulo Escaleno es: " + resultado);
    }

    public void CalcularIsoceles(View v) {
        String strBase = txtBase.getText().toString();
        String strAltura = txtAltura.getText().toString();

        if (strBase.isEmpty() || strAltura.isEmpty()) {
            mostrarToast("Llene todos los campos");
            return;
        }

        double base = Double.parseDouble(strBase);
        double altura = Double.parseDouble(strAltura);

        double resultado = (1 / 2) * base * altura;
        lblResultado.setText("El área del Triángulo Isósceles es: " + resultado);
    }

    public void CalcularEquilatero(View v) {
        String strBase = txtBase.getText().toString();

        if (strBase.isEmpty()) {
            mostrarToast("Llene todos los campos");
            return;
        }

        double base = Double.parseDouble(strBase);
        double resultado = (Math.sqrt(3) / 4) * (base * base);
        lblResultado.setText("El área del Triángulo Equilátero es: " + resultado);
    }

    private void mostrarToast(String mensaje) {
        Toast.makeText(TrianguloActivity.this, mensaje, Toast.LENGTH_LONG).show();
    }



}