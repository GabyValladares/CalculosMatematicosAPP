package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TrapecioActivity extends AppCompatActivity {
    TextView edBMayor, edBMenor, edAltura, edLadoA, edLadoB, edLadoC, edLadoD;
    TextView tvResultArea, tvResultPeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        edBMayor=findViewById(R.id.txtBaseMayorTrap);
        edBMenor=findViewById(R.id.txtBaseMenorTrap);
        edAltura=findViewById(R.id.txtBaseAlturaTrap);
        tvResultArea=findViewById(R.id.lblResultArea);

        edLadoA=findViewById(R.id.txtA);
        edLadoB=findViewById(R.id.txtB);
        edLadoC=findViewById(R.id.txtC);
        edLadoD=findViewById(R.id.txtD);
        tvResultPeri=findViewById(R.id.lblResultPerim);

    }

    public void calcularArea(View v){
        double BMayor=Double.parseDouble(edBMayor.getText().toString());
        double BMenor=Double.parseDouble(edBMenor.getText().toString());
        double Altura=Double.parseDouble(edAltura.getText().toString());

        double sumBases = BMayor+BMenor;
        double divPara2 = sumBases/2;
        double multiPorAl = divPara2*Altura;
        tvResultArea.setText(multiPorAl+"");
    }
    public void calcularPerimetro(View v){
        double A=Double.parseDouble(edLadoA.getText().toString());
        double B=Double.parseDouble(edLadoB.getText().toString());
        double C=Double.parseDouble(edLadoC.getText().toString());
        double D=Double.parseDouble(edLadoD.getText().toString());

        double resultado = A+B+C+D;
        tvResultPeri.setText(resultado+"");
    }

    public void volver(View v){
        Intent inte=new Intent(TrapecioActivity.this, MenuOperaciones.class);
        startActivity(inte);
    }

}