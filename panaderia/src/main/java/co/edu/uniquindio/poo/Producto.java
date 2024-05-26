package co.edu.uniquindio.poo;

public abstract class Producto implements Calculable{
    private final String nombre;
    private double precio;
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    private final int stock;


    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }


    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public int getStock() {
        return stock;
    }


    

    




}
