package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Factorial extends AppCompatActivity {

    EditText edNum1;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);


        // Obtén referencias a los elementos de la interfaz
        edNum1 = findViewById(R.id.txtNumero);
        tvResultado = findViewById(R.id.lblResultado);

        // Obtén referencia al botón de cálculo
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        // Asigna un OnClickListener al botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Obtiene el número ingresado por el usuario
                String strNum1 = edNum1.getText().toString();

                // Verifica si se ingresó un número válido
                if (!strNum1.isEmpty()) {
                    // Convierte el texto a un número entero
                    int num1 = Integer.parseInt(strNum1);

                    // Calcula el factorial y lo muestra en el TextView
                    long factorial = calcularFactorial(num1);
                    tvResultado.setText("Factorial de " + num1 + ": " + factorial);
                } else {
                    // Muestra un mensaje si no se ingresó un número válido
                    tvResultado.setText("Por favor, ingresa un número válido.");
                }
            }
        });


        // Asigna un OnClickListener al botón "Regresar"
            btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Factorial.this, MenuOperaciones.class);
                startActivity(intent);
            }
        });
    }


    private long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }

    }


}

