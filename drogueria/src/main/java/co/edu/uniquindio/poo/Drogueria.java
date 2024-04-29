package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {
    private final String nombre;
    private Collection<Producto> productos;
    private Collection<Pedido> pedidos;
    private Collection<Cliente> clientes;
    private Collection<Empleado> empleados;

    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.productos = new LinkedList<>();
        this.pedidos = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.empleados = new LinkedList<>();

    }

    public Collection<Producto> getStockMayorCien(){
        Collection<Producto> listaMayorCien= new LinkedList<>();
        for(Producto producto :productos){
            if(producto.getStock()>100){
                listaMayorCien.add(producto);
            }
        }
        return listaMayorCien;
    }

    






    public String getNombre() {
        return nombre;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    

    

    
}
