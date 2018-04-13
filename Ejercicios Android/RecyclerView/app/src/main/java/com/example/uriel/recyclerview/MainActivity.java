package com.example.uriel.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        Adapter adapter = new Adapter(cargarProductos());

        recyclerView.setAdapter(adapter);


    }

    private List<Producto> cargarProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        listaProductos.add(new Producto("colgate","20",R.drawable.colgate));
        return listaProductos;
    }
}
