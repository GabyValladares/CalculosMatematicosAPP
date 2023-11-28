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

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Button btnTrinomio=findViewById(R.id.btnTrinomio);


        // Configurar el título
        titleTextView.setText("Título de la Actividad");

        // Cargar el GIF en el ImageView usando Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.lineas)
                .into(gifBackground);




        // Configurar el OnClickListener para el Button2
       // button2.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
             //   // Abrir la actividad MainActivitySumar
               // Intent intent = new Intent(MenuOperaciones.this, MainActivitySumar.class);
               // startActivity(intent);
           // }
        //});

        btnPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuOperaciones.this, NumerosPrimos.class);
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
        Button buttonDivision = findViewById(R.id.btn_said);

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuOperaciones.this, ComprobacionDePrimos.class);

                startActivity(intent);
            }
        });


        }



        public  void pitagoras(View v){

            Intent in = new Intent(MenuOperaciones.this, MainActivity.class);
            startActivity(in);


        }

    }











