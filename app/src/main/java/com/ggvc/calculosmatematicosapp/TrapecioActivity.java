package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TrapecioActivity extends AppCompatActivity {
    TextView edBMayor, edBMenor, edAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        edBMayor=findViewById(R.id.txtBaseMayorTrap);

    }
}