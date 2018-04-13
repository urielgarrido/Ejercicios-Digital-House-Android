package com.example.uriel.materialdesign;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MostrarMensajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestrar_mensaje);

        MensajeMostradoFragment mensajeMostradoFragment = new MensajeMostradoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.contenedor_mostrador_mensaje,mensajeMostradoFragment);
        fragmentTransaction.commit();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        mensajeMostradoFragment.setArguments(bundle);
    }
}
