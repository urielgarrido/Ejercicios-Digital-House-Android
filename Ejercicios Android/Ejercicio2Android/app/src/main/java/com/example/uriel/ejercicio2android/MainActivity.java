package com.example.uriel.ejercicio2android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numero;
    private Button suma;
    private Button resta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        suma=findViewById(R.id.suma);
        resta=findViewById(R.id.resta);
    }

    public void clickSumar(View view){
        Integer numeroEntero=Integer.parseInt(numero.getText().toString());
        numeroEntero++;
        numero.setText(numeroEntero.toString());
    }

    public void clickRestar(View view){
        Integer numeroEntero=Integer.parseInt(numero.getText().toString());
        numeroEntero--;
        numero.setText(numeroEntero.toString());
    }
}
