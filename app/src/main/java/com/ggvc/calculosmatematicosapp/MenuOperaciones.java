package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;



public class MenuOperaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

        // Obtener referencias a los elementos de la interfaz
        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView gifBackground = findViewById(R.id.gifBackground);
        Button button2 = findViewById(R.id.button2);
        Button btnPrimos = findViewById(R.id.btnNPrimos);
        Button buttonDivision = findViewById(R.id.btn_said);
        Button btformulag = findViewById(R.id.btnformulageneral);
        Button btnTrinomio = findViewById(R.id.btnTrinomio);

        btformulag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, FormulaGeneral.class);
                startActivity(intent);
            }
        });
        // Configurar el OnClickListener para el Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad MainActivitySumar
                Intent intent = new Intent(MenuOperaciones.this, MainActivitySumar.class);
                startActivity(intent);
            }
        });
        GridLayout gridLayout = findViewById(R.id.gridLayout);

        // Configurar el título
        titleTextView.setText("Título de la Actividad");

        // Cargar el GIF en el ImageView usando Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.lineas)
                .into(gifBackground);
        btnPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, NumerosPrimos.class);
                startActivity(intent);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuOperaciones.this, ComprobacionDePrimos.class);
                startActivity(intent);
            }
        });

        btnTrinomio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuOperaciones.this,MultiplicacionMonomios.class);
                startActivity(intent);
            }
        });
    }
}

