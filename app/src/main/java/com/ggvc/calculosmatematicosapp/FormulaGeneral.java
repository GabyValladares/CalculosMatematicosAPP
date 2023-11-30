package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormulaGeneral extends AppCompatActivity {

    Button btregresa;

    EditText numeroa, numerob, numeroc;

    TextView positivo, negativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_general);
        numeroa = findViewById(R.id.ednumeroa);
        numerob = findViewById(R.id.ednumerob);
        numeroc = findViewById(R.id.ednumeroc);

        positivo = findViewById(R.id.txtposi);
        negativo = findViewById(R.id.txtnega);
        btregresa = findViewById(R.id.btnregresa);

        btregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormulaGeneral.this, MenuOperaciones.class);
                startActivity(intent);
            }
        });
    }

    public void calculaFormula(View view) {
        // Verificar si los campos están vacíos
        if (numeroa.getText().toString().isEmpty() ||
                numerob.getText().toString().isEmpty() ||
                numeroc.getText().toString().isEmpty()) {
            mostrarToast("Por favor, complete todos los campos");
            return;
        }

        double a = Double.parseDouble(numeroa.getText().toString());
        double b = Double.parseDouble(numerob.getText().toString());
        double c = Double.parseDouble(numeroc.getText().toString());

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            positivo.setText("" + resultado1);
            negativo.setText("" + resultado2);
        } else if (discriminante == 0) {
            // Dos soluciones reales iguales
            double resultado = -b / (2 * a);
            positivo.setText("" + resultado);
            negativo.setText("");  // Deja el campo negativo vacío en este caso
        } else {
            // Soluciones imaginarias o complejas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);

            // Formatea los resultados para incluir la parte imaginaria
            String resultado1 = String.format("%.2f + %.2fi", parteReal, parteImaginaria);
            String resultado2 = String.format("%.2f - %.2fi", parteReal, parteImaginaria);

            positivo.setText(resultado1);
            negativo.setText(resultado2);
        }
    }

    private void mostrarToast(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
