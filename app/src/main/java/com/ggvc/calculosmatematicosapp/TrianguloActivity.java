package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TriangulosActivity extends AppCompatActivity {

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
    }

    public void CalcularEscaleno(View v){
        double base = Double.parseDouble(txtBase.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());
        if (base == 0 || altura == 0) {
            Toast.makeText(TriangulosActivity.this, "Llene los Espacios", Toast.LENGTH_LONG).show();
        } else {
            double Resultado = (1 / 2) * base * altura;
            lblResultado.setText("El area del Triangulo Escaleno es: " + Resultado);
        }
    }
    public void CalcularIsoceles(View v){
        double base = Double.parseDouble(txtBase.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());
        if (base == 0 || altura == 0) {
            Toast.makeText(TriangulosActivity.this, "Llene los Espacios", Toast.LENGTH_LONG).show();
        } else {
            double Resultado = (1 / 2) * base * altura;
            lblResultado.setText("El area del Triangulo Isoceles es: " + Resultado);
        }
    }
    public void CalcularEquilatero(View v){
        double base = Double.parseDouble(txtAltura.getText().toString());
        if (base == 0){
            Toast.makeText(TriangulosActivity.this, "Llene los Espacios", Toast.LENGTH_LONG).show();
        } else {
            double resultado = (Math.sqrt(3)/4)*(base*base);
            lblResultado.setText("El area del Triangulo Equilatero es: " + resultado);
        }
    }

}