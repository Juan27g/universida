package co.edu.uniquindio.poo;

public class Pastel extends Producto {
    private int tamaño;
    private int sabor; // vamos a tomarla en una escala del 1 al 5 pa ver qué tan rico es xd
    public Pastel(String nombre, int stock, int tamaño, int sabor) {
        super(nombre, stock);
        this.tamaño = tamaño;
        this.sabor = sabor;
    }
    @Override
    public double calcularPrecioTotal() {
        double precio= tamaño*sabor; 
        return precio;
    }
   

    


}
