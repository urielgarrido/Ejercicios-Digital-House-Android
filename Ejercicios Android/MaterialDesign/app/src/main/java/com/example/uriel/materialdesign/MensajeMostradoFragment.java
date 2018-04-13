package com.example.uriel.materialdesign;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MensajeMostradoFragment extends Fragment {

    TextView mensajeAMostrar,regaloAMostrar;
    private String mensaje;
    private String regalo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mensaje_mostrado, container, false);
        mensajeAMostrar=view.findViewById(R.id.textview_mensaje_escrito);
        regaloAMostrar=view.findViewById(R.id.textview_regalo_escrito);

        Bundle bundle = getArguments();
         mensaje=bundle.getString(MainActivity.CLAVE_MENSAJE);
         regalo=bundle.getString(MainActivity.CLAVE_REGALO);

        mensajeAMostrar.setText(mensaje);



        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!TextUtils.isEmpty(regalo)){
            regaloAMostrar.setText(regalo);
            Snackbar.make(mensajeAMostrar,"Mensaje enviado",Snackbar.LENGTH_LONG).show();
        }else {
            regaloAMostrar.setText("No pidió regalos");
            Snackbar.make(mensajeAMostrar,"Mensaje enviado",Snackbar.LENGTH_LONG).show();
        }
    }
}
