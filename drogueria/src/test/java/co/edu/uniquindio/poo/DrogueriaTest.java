/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(DrogueriaTest.class.getName());

    /**Prueba producto sin Stock
     */
    @Test
    public void pedidoSinStock() {
        LOG.info("Iniciado test sin stock");
        Drogueria drogueria = new Drogueria("La propia");
        Collection<Producto> productos= new LinkedList<>();
        Gerente gerente= new Gerente("Samuel", "Torres", "302350", "calle 27", "3023500889", 100000);
        
        assertThrows(Throwable.class,()-> gerente.agregarProducto(drogueria, productos, new Medicamento("gtlt", "xanax", "Tomar todos los días", 500, 0, "Tatiana", 0.75)));
        
        LOG.info("Finalizando test sin stock");
    }

    /**Prueba de productos con stock mayor a 100
     */
    @Test
    public void stockcien() {
        LOG.info("Iniciado test de productos con stock mayor a 100");

        Drogueria drogueria = new Drogueria("La propia");
        Collection<Producto> productos= new LinkedList<>();
        Gerente gerente= new Gerente("Samuel", "Torres", "302350", "calle 27", "3023500889", 100000);

        Medicamento medicamento=  new Medicamento("gtlt", "xanax", "Tomar todos los días", 500, 50, "Tatiana", 0.75);
        Hogar hogar= new Hogar("abcd", "Faboloso", "El propio", 2000, 150, "Tatiana", "No consumir");
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal("sdlt", "Pasta dental", "usar diario", 5500, 1100, "tatiana", "Fluor");

 
        gerente.agregarProducto(drogueria, productos, medicamento);
        gerente.agregarProducto(drogueria, productos, hogar);
        gerente.agregarProducto(drogueria, productos, cuidadoPersonal);

        Collection<Producto> productosMayorCien = drogueria.getStockMayorCien();

        assertEquals(0, productosMayorCien.size());

        LOG.info("Finalizando test de productos con stock mayor a 100");
    }

    /**Prueba calcular costo de un pedido
     */
    @Test
    public void costoPedido() {
        LOG.info("Iniciado test calcular costo de un pedido");  

        Drogueria drogueria = new Drogueria("La propia");
        Collection<Producto> productos= new LinkedList<>();
        Medicamento medicamento=  new Medicamento("gtlt", "xanax", "Tomar todos los días", 500, 50, "Tatiana", 0.75);
        Cliente cliente= new Cliente("Juan", "Herrera", "1066869"," Cr 27 07", "3023200889");

        Pedido pedido= new Pedido(LocalDate.of(2024, 04, 27), 10, medicamento, cliente);
        assertEquals(5000, pedido.calcularCostoPedido(medicamento));
        LOG.info("Finalizando test calcular costo de un pedido");
    }




    
}
