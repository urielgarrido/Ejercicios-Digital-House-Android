package com.example.uriel.comunicacionentreactivitysejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button botonRegistrar;
    private EditText editTextUsuario, editTextContraseña, editTextRepetirContraseña;
    private String contraseña;
    private String confirmarContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextUsuario = findViewById(R.id.register_edittext_usuario);
        editTextContraseña = findViewById(R.id.register_edittext_contraseña);
        editTextRepetirContraseña = findViewById(R.id.register_edittext_confirmar_contraseña);
        botonRegistrar = findViewById(R.id.register_button_registrar);
        contraseña = editTextContraseña.getText().toString();
        confirmarContraseña = editTextRepetirContraseña.getText().toString();
        Intent intentRecivido = getIntent();
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                if (contraseña.equals(confirmarContraseña)) {
                    startActivity(intent);
                } else
                    Toast.makeText(RegisterActivity.this, "Su contraseña no se confirmó correctamente", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
