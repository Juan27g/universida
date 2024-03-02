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
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Pruebita de datos completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        Estudiante estudiante = new Estudiante("Geraldine", "Londoño Torres", "109453264", "geraldine@uniquindio.edu.co",
                "315635674", 18);

        assertEquals("Geraldine", estudiante.nombres());
        assertEquals("Londoño Torres", estudiante.apellidos());
        assertEquals("109453264", estudiante.numeroIdentificacion());
        assertEquals("geraldine@uniquindio.edu.co", estudiante.correo());
        assertEquals("315635674", estudiante.telefono());
        assertEquals(18, estudiante.edad());
        LOG.info("Finalización datosCompletos");
    }

    /**
     * Prueba para verificar que los datos de un estudiante no estén nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, 18));
        LOG.info("Finalización datosNulos");
    }

    /**
     * Prueba para verificar que los datos de un estudiante no estén vacios
     */
    @Test
    public void datosVacios() {
        LOG.info("Inicio datosVacios");
        assertThrows(Throwable.class, () -> new Estudiante("", "", "", "geraldine@uniquindio.edu.co", "", (byte)18));
        LOG.info("Finalización datosVacios");
    }

    /**
     * Prueba para verificar que el correo del estudiante este correcto
     */
    @Test
    public void edadNegativa() {
        LOG.info("Inicio datosNegativos");
        assertThrows(Throwable.class, () -> new Estudiante("Geraldine", "Londoño Torres", "109453264",
                "geraldine@uniquindio.edu.co", "315635674", -18));
        LOG.info("Finalización datosNegativos");
    }

    /**
     * Prueba para verificar que el correo del estudiante esté correcto
     */
    @Test
    public void correoInvalido() {
        LOG.info("Inicio correoInvalido");
        assertThrows(Throwable.class,
                () -> new Estudiante("Geraldine", "Londoño Torres", "109453264", "gera", "315635674", 18));
        LOG.info("Finalización correoInvalido");
    }

}

