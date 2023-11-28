package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TinomioCuadradoPerfecto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinomio_cuadrado_perfecto);


        EditText editTextUno = findViewById(R.id.txtnumerouno);
        EditText editTextDos = findViewById(R.id.txtnumerodos);
        EditText editTextTres = findViewById(R.id.txtnumerotres);
        Button buttonCalcular = findViewById(R.id.bttcalcular);
        Button buttonRegresar = findViewById(R.id.bttregresarOper);
        TextView textViewRespuesta = findViewById(R.id.lblrespuesta);


        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strUno = editTextUno.getText().toString();
                String strDos = editTextDos.getText().toString();
                String strTres = editTextTres.getText().toString();


                if (!strUno.isEmpty() && !strDos.isEmpty() && !strTres.isEmpty()) {

                    double numUno = Double.parseDouble(strUno);
                    double numDos = Double.parseDouble(strDos);
                    double numTres = Double.parseDouble(strTres);


                    double resultado = numUno * numUno + 2 * numUno * numDos + numDos * numDos;


                    textViewRespuesta.setText("  " + resultado);
                } else {

                    textViewRespuesta.setText("*Llene todos los campos");
                }
            }
        });
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TinomioCuadradoPerfecto.this,MenuOperaciones.class);
                startActivity(intent);
            }
        });
    }
}
