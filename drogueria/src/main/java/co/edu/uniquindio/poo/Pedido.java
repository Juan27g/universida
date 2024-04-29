package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto productoPedido;
    private Cliente cliente;

    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido, Cliente cliente) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        this.cliente = cliente;
        assert cantidad<productoPedido.getStock():"No hay la cantidad suficiente en stock";   
    }
    
    
    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Producto getProductoPedido() {
        return productoPedido;
    }
    public Cliente getCliente() {
        return cliente;
    }
    
    public double calcularCostoPedido(Producto producto){
        return cantidad*producto.getPrecio();
    }


    
}
