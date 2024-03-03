package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Prueba datos completos Veterinaria
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio prueba de datos completos veterinaria");
        var veterinaria = new Veterinaria("Amigos Peludos");
        assertEquals("Amigos Peludos", veterinaria.getNombre());
        LOG.info("Finalizado de la prueba de datos completos veterinaria");
    }

    /**
     * Prueba agregar una mascota a la veterinaria
     */
    @Test
    public void agregarMascota() {
        LOG.info("Inicio prueba agregar una mascota");
        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota = new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)7, "Masculino", "Dorado", 12.5 );
        veterinaria.registrarMascota(mascota);
        assertEquals(1, veterinaria.getListaMascotas().size());

        LOG.info("Finalizado prueba agregar una mascota");
    }


    /**
     * Prueba datos nulos veterinaria
     */
    @Test
    public void VeterinariaNula() {
        LOG.info("Inicio datos nulos veterinaria");

        assertThrows(Throwable.class, () -> new Veterinaria(null));

        LOG.info("Finalizado datos nulos veterinaria");
    }


    /**
     * Prueba ID repetida
     */
    @Test
    public void agregarMascotaRepetido() {
        LOG.info("Inicio ID repetida");
        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota1 = new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)11, "Masculino", "Dorado", 12.5 );
        var mascota2 = new Mascota("Wosito","1066", "Canino", "Frespuder", (byte)7, "Masculino", "Blanco", 19.5 );
        veterinaria.registrarMascota(mascota1);
        assertThrows(Throwable.class, () -> veterinaria.registrarMascota(mascota2));
        LOG.info("Finalizado ID repetida");
    }


    /**
     * Prueba obtener mascotas mayores a 10 años
     */
    @Test
    public void obtenerMascotasMayoresA10Anios() {
        LOG.info("Inicio prueba obtener mascotas mayores a 10 años");

        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota1 = new Mascota("Maximiliano","1159", "Canino", "Frespuder", (byte)11, "Masculino", "Dorado", 12.5 );
        Mascota mascota2 = new Mascota("Wosito","1066", "Canino", "Frespuder", (byte)7, "Masculino", "Blanco", 19.5 );
        Mascota mascota3 = new Mascota("Rey","0101", "Canino", "schnauzer", (byte)14, "Masculino", "Negro", 14 );
        veterinaria.registrarMascota(mascota1);
        veterinaria.registrarMascota(mascota2);
        veterinaria.registrarMascota(mascota3);
        List<Mascota> mascotasMayoresA10 = veterinaria.getMascotasMayoresDiez();
        assertEquals(2, mascotasMayoresA10.size());
        LOG.info("Finalizado prueba obtener mascotas mayores a 10 años");
    }


    
}
