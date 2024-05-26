package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PropietarioTest {
    private static final Logger LOG = Logger.getLogger(PropietarioTest.class.getName());

    @Test
    public void crearPropietarioValido() {
        LOG.info("Iniciando Test");

        Propietario propietario = new Propietario("Juan", "12345678");
        assertEquals("Juan", propietario.getNombre());
        assertEquals("12345678", propietario.getDocumentoIdentidad());

        LOG.info("Finalizando Test");
    }

     @Test
    public void crearPropietarioConNombreNulo() {
        LOG.info("Iniciando Test");

        assertThrows(IllegalArgumentException.class, () -> new Propietario(null, "12345678"));
        LOG.info("Finalizando Test");
    }

    @Test
    public void crearPropietarioConNombreVacio() {
        LOG.info("Iniciando Test");

        assertThrows(IllegalArgumentException.class, () -> new Propietario("", "12345678"));

        LOG.info("Finalizando Test");
    }
}