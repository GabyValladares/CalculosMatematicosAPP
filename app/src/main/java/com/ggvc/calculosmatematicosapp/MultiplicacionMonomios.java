package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicacionMonomios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion_monomios);


        EditText editTextUno = findViewById(R.id.txtnumeroone);
        EditText editTextDos = findViewById(R.id.txtnumerotwo);
        Button buttonCalcular = findViewById(R.id.bttcalcularmono);
        Button bottonRegresar = findViewById(R.id.bttregresar);
        TextView textViewRespuesta = findViewById(R.id.lblres);


        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strUno = editTextUno.getText().toString();
                String strDos = editTextDos.getText().toString();


                if (!strUno.isEmpty() && !strDos.isEmpty()) {

                    double numUno = Double.parseDouble(strUno);
                    double numDos = Double.parseDouble(strDos);


                    double resultado = numUno * numDos;


                    textViewRespuesta.setText("Respuesta: " + resultado);
                } else {

                    textViewRespuesta.setText("Por favor, ingrese números en ambos campos");
                }
            }
        });
        bottonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MultiplicacionMonomios.this, MenuOperaciones.class);

                startActivity(intent);
            }
        });
    }

}
