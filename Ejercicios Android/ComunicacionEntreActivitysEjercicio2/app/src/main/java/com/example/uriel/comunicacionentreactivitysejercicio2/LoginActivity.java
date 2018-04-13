package com.example.uriel.comunicacionentreactivitysejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public static final String CLAVE_USUARIO="asds";

    private TextView usuarioRecivido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuarioRecivido=findViewById(R.id.login_textview_usuario_recivido);
        Intent intentRecivido=getIntent();
        Bundle bundleRecivido = intentRecivido.getExtras();
        String nombreRecivido=bundleRecivido.getString(CLAVE_USUARIO);

        usuarioRecivido.setText(nombreRecivido);
    }
}
