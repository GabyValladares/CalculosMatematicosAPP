package com.ggvc.calculosmatematicosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        editText = findViewById(R.id.editTextNumberSigned);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.TexView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().trim().isEmpty()) {
                    mostrarToast("Por favor, ingrese un número");
                } else {
                    textView.setText(fibonacci(Integer.parseInt(editText.getText().toString())));
                }
            }
        });
    }

    private String fibonacci(int n) {
        String text = "";
        ArrayList<BigInteger> fib = new ArrayList<>();
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        fib.add(first);
        fib.add(second);
        for (int i = 1; i < n; i++) {
            fib.add(fib.get(1).add(fib.get(i - 1)));
        }
        for (int i = 1; i <= n; i++) {
            text = text + i + ". " + fib.get(i) + "\n";
        }
        return text;
    }

    public void regresarFib(View v) {
        Intent in = new Intent(FibonacciActivity.this, MenuOperaciones.class);
        startActivity(in);
    }

    private void mostrarToast(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
