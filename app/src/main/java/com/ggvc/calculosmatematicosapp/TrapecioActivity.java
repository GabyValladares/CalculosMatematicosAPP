package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrapecioActivity extends AppCompatActivity {
    EditText edBMayor, edBMenor, edAltura, edLadoA, edLadoB, edLadoC, edLadoD;
    TextView tvResultArea, tvResultPeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        edBMayor = findViewById(R.id.txtBaseMayorTrap);
        edBMenor = findViewById(R.id.txtBaseMenorTrap);
        edAltura = findViewById(R.id.txtBaseAlturaTrap);
        tvResultArea = findViewById(R.id.lblResultArea);

        edLadoA = findViewById(R.id.txtA);
        edLadoB = findViewById(R.id.txtB);
        edLadoC = findViewById(R.id.txtC);
        edLadoD = findViewById(R.id.txtD);
        tvResultPeri = findViewById(R.id.lblResultPerim);
    }

    public void calcularArea(View v) {
        if (camposVacios(edBMayor, edBMenor, edAltura)) {
            mostrarToast("Hay campos sin completar");
            return;
        }

        double BMayor = Double.parseDouble(edBMayor.getText().toString());
        double BMenor = Double.parseDouble(edBMenor.getText().toString());
        double Altura = Double.parseDouble(edAltura.getText().toString());

        double sumBases = BMayor + BMenor;
        double divPara2 = sumBases / 2;
        double multiPorAl = divPara2 * Altura;
        tvResultArea.setText(String.valueOf(multiPorAl));
    }

    public void calcularPerimetro(View v) {
        if (camposVacios(edLadoA, edLadoB, edLadoC, edLadoD)) {
            mostrarToast("Hay campos sin completar");
            return;
        }

        double A = Double.parseDouble(edLadoA.getText().toString());
        double B = Double.parseDouble(edLadoB.getText().toString());
        double C = Double.parseDouble(edLadoC.getText().toString());
        double D = Double.parseDouble(edLadoD.getText().toString());

        double resultado = A + B + C + D;
        tvResultPeri.setText(String.valueOf(resultado));
    }

    public void volver(View v) {
        Intent inte = new Intent(TrapecioActivity.this, MenuOperaciones.class);
        startActivity(inte);
    }

    private boolean camposVacios(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (editText.getText().toString().trim().isEmpty()) {
                return true; // Si al menos un campo está vacío, retorna true
            }
        }
        return false; // Todos los campos están llenos
    }

    private void mostrarToast(String mensaje) {
        Toast.makeText(TrapecioActivity.this, mensaje, Toast.LENGTH_LONG).show();
    }
}
