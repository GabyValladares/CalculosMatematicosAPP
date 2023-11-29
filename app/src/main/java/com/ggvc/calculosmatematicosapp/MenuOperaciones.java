package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MenuOperaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

        // Obtener referencias a los elementos de la interfaz
        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView gifBackground = findViewById(R.id.gifBackground);
        Button button2 = findViewById(R.id.button2);

        // Configurar el título
        titleTextView.setText("ELIJA SU OPERACION");

        // Cargar el GIF en el ImageView usando Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.lineas)
                .into(gifBackground);

        // Configurar el OnClickListener para el Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad MainActivitySumar
                Intent intent = new Intent(MenuOperaciones.this, MainNumerosPerfectos.class);
                startActivity(intent);
            }
        });
    }
}