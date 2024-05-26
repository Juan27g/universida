package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Panaderia {
    private final String nombre;
    private ArrayList<Producto> productos;
    public String getNombre() {
        return nombre;
    }


    


    public Panaderia(String nombre) {
        this.nombre = nombre;
    }





    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    
}
