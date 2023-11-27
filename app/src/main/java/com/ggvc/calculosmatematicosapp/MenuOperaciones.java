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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

        // Obtener referencias a los elementos de la interfaz
        TextView titleTextView = findViewById(R.id.titleTextView);
        GridLayout gridLayout = findViewById(R.id.gridLayout);

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

    }

}
