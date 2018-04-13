package com.example.uriel.fragmentsejercicio;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout contenedor;
    private Button fragmentRojo,fragmentVerde;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentColores fragmentRojoDeFabrica=FragmentColores.fabricaDeFragments(R.color.rojo);
        final FragmentColores fragmentVerdeDeFabrica=FragmentColores.fabricaDeFragments(R.color.verde);

        contenedor=findViewById(R.id.contenedor);
        fragmentRojo=findViewById(R.id.main_button_fragment_rojo);
        fragmentVerde=findViewById(R.id.main_button_fragment_verde);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.contenedor,fragmentRojoDeFabrica);
                fragmentTransaction.commit();
            }
        });

        fragmentVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contenedor,fragmentVerdeDeFabrica);
                fragmentTransaction.commit();
            }
        });
    }
}
