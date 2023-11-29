package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class MenuOperaciones extends AppCompatActivity {

    Button btformulag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

        // Obtener referencias a los elementos de la interfaz
        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView gifBackground = findViewById(R.id.gifBackground);
        Button button2 = findViewById(R.id.button2);
        Button btnPrimos = findViewById(R.id.btnNPrimos);
        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Button btnTrinomio = findViewById(R.id.btnTrinomio);
        Button buttonDivision = findViewById(R.id.btn_said);
        Button button3 = findViewById(R.id.btnPentagono);

        btformulag = findViewById(R.id.btnformulageneral);

        Button btnJefersonY = findViewById(R.id.btnJefersonY);


        // Configurar el título
        titleTextView.setText("Título de la Actividad");

        // Cargar el GIF en el ImageView usando Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.lineas)
                .into(gifBackground);

        // Configurar el OnClickListener para el Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el OnClickListener para el Button3 (Pentágono)
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, Area_Perimetro_Pentagono.class);
                startActivity(intent);
            }
        });

        // Configurar el OnClickListener para btformulag
        btformulag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuOperaciones.this, FormulaGeneral.class);
                startActivity(intent);
            }
        });

        // Otros botones con OnClickListener similares
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
                Intent intent = new Intent(MenuOperaciones.this, MultiplicacionMonomios.class);
                startActivity(intent);
            }
        });

        btnJefersonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Factorial
                Intent intent = new Intent(MenuOperaciones.this, Factorial.class);
                startActivity(intent);
            }
        });
    }

    // Métodos adicionales según tu código original
    public void pitagoras(View v) {
        Intent in = new Intent(MenuOperaciones.this, MainActivity.class);
        startActivity(in);
    }

    public void fibonacci(View v) {
        Intent in = new Intent(MenuOperaciones.this, FibonacciActivity.class);
        startActivity(in);
    }
}
