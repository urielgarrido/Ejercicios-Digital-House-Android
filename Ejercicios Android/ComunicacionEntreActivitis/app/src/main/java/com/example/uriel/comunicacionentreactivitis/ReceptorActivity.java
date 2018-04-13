package com.example.uriel.comunicacionentreactivitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReceptorActivity extends AppCompatActivity {

    public static final String NOMBRE_RECIVIDO  ="nombre recivido";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView = findViewById(R.id.text_view_receptor);
        Intent intentRecivido=getIntent();
        Bundle bundleRecivido =intentRecivido.getExtras();
        String nombreRecivido = bundleRecivido.getString(NOMBRE_RECIVIDO);
        textView.setText(nombreRecivido);


        Toast.makeText(this, "Hola " + nombreRecivido, Toast.LENGTH_SHORT).show();

    }
}
