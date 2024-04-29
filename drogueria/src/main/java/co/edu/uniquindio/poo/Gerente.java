package co.edu.uniquindio.poo;

import java.util.Collection;

public class Gerente extends Empleado{

    public Gerente(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono, salario);

    }

    public void agregarProducto(Drogueria drogueria, Collection<Producto> productos, Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Drogueria drogueria, Collection<Producto> productos, Producto producto){
        productos.remove(producto);
    }
    
    
}
