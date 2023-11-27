package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuOperaciones extends AppCompatActivity {

    Button btformulag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

        // Obtener referencias a los elementos de la interfaz
        TextView titleTextView = findViewById(R.id.titleTextView);
        GridLayout gridLayout = findViewById(R.id.gridLayout);

        btformulag = findViewById(R.id.btnformulageneral);

        btformulag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, FormulaGeneral.class);
                startActivity(intent);
            }
        });

        // Configurar el título
        titleTextView.setText("Título de la Actividad");

        // Agregar botones al GridLayout
        for (int i = 1; i <= 12; i++) {
            Button button = new Button(this);
            button.setText("Botón " + i);

            // Configurar el botón en el GridLayout
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.setGravity(Gravity.FILL);
            button.setLayoutParams(params);
            gridLayout.addView(button);
        }

        Button buttonDivision = findViewById(R.id.btn_said);

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuOperaciones.this, ComprobacionDePrimos.class);

                startActivity(intent);
            }
        });












    }








}
