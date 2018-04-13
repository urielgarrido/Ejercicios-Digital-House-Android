package com.example.uriel.materialdesign;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class PantallaInicio extends Fragment {

    Comunicador comunicador;
    EditText mensaje,regalo;
    TextInputLayout errorMensaje;
    FloatingActionButton floatingActionButton;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        comunicador=(Comunicador)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pantalla_inicio, container, false);

        mensaje=view.findViewById(R.id.edittext_mensaje);
        regalo=view.findViewById(R.id.edittext_regalos);
        errorMensaje=view.findViewById(R.id.text_input_layout_mensaje);
        floatingActionButton=view.findViewById(R.id.floatin_boton_mail);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regalosEscritos=regalo.getText().toString();
                String mensajeEscrito=mensaje.getText().toString();
                if(!TextUtils.isEmpty(mensajeEscrito)){
                    comunicador.botonEnviar(mensajeEscrito,regalosEscritos);
                }else {
                    errorMensaje.setError("Porfavor complete el campo Mensaje");
                }

            }
        });

        return view;
    }

    public interface Comunicador{
        public void botonEnviar(String mensaje,String regalo);
    }

}
