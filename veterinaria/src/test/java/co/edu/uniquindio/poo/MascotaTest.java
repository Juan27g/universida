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
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Prueba con datos completos
     */
    @Test
    public void TestDatosCompletosVeterinaria() {
        LOG.info("Iniciado test Vetetinatia con datos completos");

        Mascota mascota = new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)7, "Masculino", "Dorado", 12.5 );

        assertEquals("Maximiliano", mascota.nombre());
         assertEquals("Canino", mascota.especie());
         assertEquals("Frespuder", mascota.raza());
         assertEquals(7, mascota.edad());
         assertEquals("Masculino", mascota.genero());
         assertEquals("Dorado", mascota.color());
         assertEquals(12.5, mascota.peso());
        
        LOG.info("Finalizando test veterinaria con datos completos");
    }

     /*
     * Prueba de datos nulos
     */
    @Test
    public void TestDatosNulosVeterinaria() {
        LOG.info("Iniciado test Veterinaria con datos Nulos");
        
       assertThrows(Throwable.class, ()-> new Mascota(null,null, null, null, (byte)0, null, null, (double)0));
       
  
        LOG.info("Finalizando test Veterinaria con datos Nulos");
    }

     /*
     * Prueba de datos incompletos
     */
    @Test
    public void TestDatosIncompletosVeterinaria(){
        LOG.info("Iniciado test veterinaria con datos incompletos");

        assertThrows(Throwable.class, ()-> new Mascota("","", "", "Frespuder", (byte)7, "", "Dorado", 12.5 ));

        LOG.info("Finalizado test veterinaria con datos incompletos");
    }

     /*
     * Prueba de datos negativos
     */
   @Test
   public void TestDatosNegativosVeterinaria(){
    LOG.info("Iniciado test veterinaria con datos negativos");

    assertThrows(Throwable.class, ()-> new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)-7, "Masculino", "Dorado", -12.5 ));

    LOG.info("Finalizado test veterinaria con datos negativos");

     /*
     * Prueba de datos inválidos
     */
   }
   @Test
   public void TestDatosInvalidosVeterinaria() {
       LOG.info("Iniciado test  Veterinaria con datos invalidos");

       Mascota Mascota = new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)7, "Masculino", "Dorado", 12.5 );
       assertEquals("Felino" , Mascota.especie());

       LOG.info("Finalizando test Veterinaria con datos invalidos");
   }
}