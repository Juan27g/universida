/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ProductoTest {
    private static final Logger LOG = Logger.getLogger(ProductoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    /**
     * Test calcular el precio de un pastel
     */
    @Test
    public void calcularPrecioPastel() {
        LOG.info("Iniciado test calcular el precio de un pastel");
        
        
        Pastel pastel = new Pastel("De arequipe", 10, 10, 4);

        pastel.calcularPrecioTotal();

        assertEquals(40, pastel.calcularPrecioTotal());


        LOG.info("Finalizando test calcular el precio de un pastel");
    }


}
