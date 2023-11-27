package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Area_Perimetro_Pentagono extends AppCompatActivity {
    private EditText edlado, edarea, edareaP;
    private TextView edResultadoPerimetro, edResultadoarea, edResMulti, edArespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_perimetro_pentagono);
        edlado = findViewById(R.id.id_lado);
        edarea = findViewById(R.id.idArea);
        edareaP = findViewById(R.id.idPArea);
        edResultadoPerimetro = findViewById(R.id.id_Ptotal);
        edResultadoarea = findViewById(R.id.idArespuesta);
        edResMulti = findViewById(R.id.idResMulti);
        edArespuesta = findViewById(R.id.idArespuesta);
        Button btnAtras = findViewById(R.id.btnAtras);
        btnAtras.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // Abrir la actividad Area_Perimetro_Pentagono
                    Intent intent = new Intent(Area_Perimetro_Pentagono.this, MenuOperaciones.class);
                    startActivity(intent);
                }
            });
    }

    public void calcularperimetro(View v) {
        double num1 = Double.parseDouble(edlado.getText().toString());
        double resultadoPerimetro = num1 * 5;

        edResultadoPerimetro.setText(String.valueOf(resultadoPerimetro));
        edarea.setText(String.valueOf(resultadoPerimetro));
    }

    public void calculararea(View v) {
        double area = Double.parseDouble(edareaP.getText().toString());
        double area2 = Double.parseDouble(edarea.getText().toString());
        double resultadoa = area * area2;
        edResMulti.setText(resultadoa + "");
        double resul = resultadoa / 2;
        edResultadoarea.setText(resul + "");


    }


    }



