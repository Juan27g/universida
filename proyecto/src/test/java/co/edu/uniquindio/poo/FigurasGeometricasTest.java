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
public class FigurasGeometricasTest {
    private static final Logger LOG = Logger.getLogger(FigurasGeometricasTest.class.getName());

    /**
     * Test para calcular el área de un círculo
     */
    @Test
    public void calculArareaCirculo(){
        LOG.info("Inicio área círculo");
        Circulo circu= new Circulo(10);
        double areacalculada= circu.calcularArea();
        assertEquals(314.1592653589793, areacalculada);
        LOG.info("Finalizado área círculo");
    }

    /**
     * Test para calcular el área de un Cuadrado
     */
    @Test
    public void calculAreaCuadrado(){
        LOG.info("Inicio área Cuadrado");
        Cuadrado cuadrado = new Cuadrado(5);
        double areacalculada= cuadrado.calcularArea();
        assertEquals(25, areacalculada);
        LOG.info("Finalizado área Cuadrado");
    }

    /**
     * Test para calcular el área de un Rectangulo
     */
    @Test
    public void calculAreaRectangulo(){
        LOG.info("Inicio área rectangulo");
        Rectangulo rectangulo= new Rectangulo(5, 10);
        double areacalculada= rectangulo.calcularArea();
        assertEquals(50, areacalculada);
        LOG.info("Finalizado área rectangulo");
    }

    /**
     * Test para calcular el área de un Triangulo
     */
    @Test
    public void calculAreaTriangulo(){
        LOG.info("Inicio área Triangulo");
        Triangulo triangulo= new Triangulo(10, 20);
        double areacalculada= triangulo.calcularArea();
        assertEquals(100, areacalculada);
        LOG.info("Finalizado área triangulo");
    }



}
