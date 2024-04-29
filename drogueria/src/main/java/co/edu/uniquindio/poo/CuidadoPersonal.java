package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto{
    private final String indicaciones;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor, String indicaciones) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    
    
}
