package com.example.uriel.comunicacionentreactivitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext_nombre);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReceptorActivity.class);
                String nombreEscrito = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(ReceptorActivity.NOMBRE_RECIVIDO, nombreEscrito);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
