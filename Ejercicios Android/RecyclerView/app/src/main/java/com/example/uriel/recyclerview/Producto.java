package com.example.uriel.recyclerview;


public class Producto {
    private String nombre,precio;
    private Integer imagen;

    public Producto(String nombre, String precio,Integer imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
