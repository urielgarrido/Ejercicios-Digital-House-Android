package com.example.uriel.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends  RecyclerView.Adapter {

    private List<Producto> listaDeProductos;

    public Adapter (){
        listaDeProductos=new ArrayList<>();
    }

    public Adapter(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.celda,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Producto producto = listaDeProductos.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.cargarProducto(producto);
    }

    @Override
    public int getItemCount() {
        return listaDeProductos.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,precio;
        private ImageView imagen;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.celda_textview_nombre);
            precio=itemView.findViewById(R.id.celda_textview_precio);
            imagen=itemView.findViewById(R.id.producto);
        }

        public void cargarProducto(Producto producto){
            nombre.setText(producto.getNombre());
            precio.setText(producto.getPrecio());
            imagen.setImageResource(producto.getImagen());
        }
    }
}
