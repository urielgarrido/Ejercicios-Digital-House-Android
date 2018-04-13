package com.example.uriel.comunicacionentreactivitysejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario,contraseña;
    private Button botonLogin;
    private Button botonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=findViewById(R.id.main_edittext_usuario);
        contraseña=findViewById(R.id.main_edittext_contraseña);
        botonLogin=findViewById(R.id.main_button_login);
        botonRegister=findViewById(R.id.main_button_register);
    }
    public void onClickLogin(View v) {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        Bundle bundle = new Bundle();
        String usuarioEscrito=usuario.getText().toString();
        bundle.putString(LoginActivity.CLAVE_USUARIO,usuarioEscrito);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onClickRegister(View v) {
        Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(intent);
    }
}
