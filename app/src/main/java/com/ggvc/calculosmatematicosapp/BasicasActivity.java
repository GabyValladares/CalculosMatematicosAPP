package com.ggvc.calculosmatematicosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BasicasActivity extends AppCompatActivity {

    EditText edNum1,edNum2,edResul;
    Button btSumar,btRestar,btMultiplicar,btDividir,btRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicas);
        edNum1 = findViewById(R.id.txtNum1);
        edNum2 = findViewById(R.id.txtNum2);

        edResul = findViewById(R.id.txtNum3);
        btSumar = findViewById(R.id.btnSuma);
        btRestar = findViewById(R.id.btnRestar);
        btMultiplicar = findViewById(R.id.btnMultiplicar);
        btDividir = findViewById(R.id.btnDividir);
        btRegresar = findViewById(R.id.btnregresaOB);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=Double.parseDouble(edNum1.getText().toString());
                double n2=Double.parseDouble(edNum2.getText().toString());
                double suma=n1+n2;
                edResul.setText("LA SUMA ES:"+suma);
            }
        });
        btRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=Double.parseDouble(edNum1.getText().toString());
                double n2=Double.parseDouble(edNum2.getText().toString());
                double resta=n1-n2;
                edResul.setText("LA RESTA ES:"+resta);
            }
        });
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=Double.parseDouble(edNum1.getText().toString());
                double n2=Double.parseDouble(edNum2.getText().toString());
                double multiplicar=n1*n2;
                edResul.setText("LA MULTIPLICACIÓN ES:"+multiplicar);

            }
        });
        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=Double.parseDouble(edNum1.getText().toString());
                double n2=Double.parseDouble(edNum2.getText().toString());
                if(n2>0){
                    double dividir=n1/n2;
                    edResul.setText("LA DIVISIÓN ES:"+dividir);
                }else{
                    Toast.makeText(BasicasActivity.this,"NO SE PUEDE DIVIDIR PARA 0",Toast.LENGTH_LONG).show();
                }
            }
        });

        btRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicasActivity.this, MenuOperaciones.class);
                startActivity(intent);
            }
        });
    }

}