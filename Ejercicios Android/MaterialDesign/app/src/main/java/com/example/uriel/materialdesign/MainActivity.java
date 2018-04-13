package com.example.uriel.materialdesign;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PantallaInicio.Comunicador {

    public static final String CLAVE_MENSAJE = "ASD";
    public static final String CLAVE_REGALO = "asd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PantallaInicio fragmentInicio = new PantallaInicio();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.contenedor_pantalla_inicio,fragmentInicio);
        fragmentTransaction.commit();
    }


    @Override
    public void botonEnviar(String mensaje,String regalo) {
        Intent intent = new Intent(MainActivity.this,MostrarMensajeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(CLAVE_MENSAJE,mensaje);
        bundle.putString(CLAVE_REGALO,regalo);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
