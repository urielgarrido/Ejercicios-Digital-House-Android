package com.example.uriel.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radio_group);
    }

    public void clickButton(View view) {
        Integer radioId=radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton=findViewById(radioId);
        if (radioId==-1){
            Toast.makeText(this, "Selecciona una opción", Toast.LENGTH_SHORT).show();
        }else{
            String opcionSeleccionada =radioButton.getText().toString();
            Toast.makeText(this, "Opción seleccionada: "+opcionSeleccionada, Toast.LENGTH_SHORT).show();
        }

    }
}
