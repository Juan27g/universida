package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());


     /**
     * Prueba de datos completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test de datos completos.");
        Curso curso = new Curso("Programacion I");
        assertEquals("Programacion I", curso.getNombre());
        LOG.info("Finalizado test de datos completos.");
    }


     /**
     * Prueba de agregar un estudiante
     */
    @Test
    public void registrarEstudiante() {
        LOG.info("Iniciando test de agregar un estudiante.");
        Curso curso = new Curso("Programacion I");
        Estudiante estudiante = new Estudiante("Geraldine", "Londoño Torres", "109453264","geraldine@uniquindio.edu.co","315635674", 18);
        curso.registrarEstudiante(estudiante);
        LOG.info("Finalizado test de agregar un estudiante.");
    }
    /**
     * Prueba para verificar que los datos de un curso no estén nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");

        assertThrows(Throwable.class, () -> new Curso(null));
        LOG.info("Finalización datosNulos");
    }

    /**
     * Prueba para verificar que los datos de un curso no estén nulos
     */
    @Test
    public void agregarEstudianteRepetido() {
        LOG.info("Inicio agregarEstudianteRepetido");

        var curso = new Curso("Programación I");

        var estudiante1 = new Estudiante("Geraldine", "Londoño Torres", "109453264","geraldine@uniquindio.edu.co","315635674", 18);
        var estudiante2 = new Estudiante("Albeiro", "García", "109453264", "albeiro@uniquindio.edu.co", "3223451278",
                19);

        curso.registrarEstudiante(estudiante1);

        assertThrows(Throwable.class, () -> curso.registrarEstudiante(estudiante2));
        LOG.info("Finalización agregarEstudianteRepetido");
    }

}
