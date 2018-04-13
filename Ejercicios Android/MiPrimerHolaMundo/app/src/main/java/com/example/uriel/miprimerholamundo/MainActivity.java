package com.example.uriel.miprimerholamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView titulo;
    private EditText nombreEditText;
    private Button botonConfirmar;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = findViewById(R.id.textview_id);
        nombreEditText = findViewById(R.id.nombre_edittext_id);
        botonConfirmar = findViewById(R.id.boton_id);
        linearLayout = findViewById(R.id.linear_layout);
    }

    public void clickDelBoton(View view) {
        Toast.makeText(this, "Bienvenido usuario: " + nombreEditText.getText().toString(), Toast.LENGTH_LONG).show();
        titulo.setText(nombreEditText.getText().toString());
        titulo.setTextSize(40);
        titulo.setTextColor(getResources().getColor(R.color.verde));
        linearLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }
}
