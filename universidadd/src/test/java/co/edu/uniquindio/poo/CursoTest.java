package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());



    @Test
    public void datosCompletos(){
        LOG.info("Iniciando test de datos completos.");
        Curso curso = new Curso("Programacion I");
        assertEquals("Programacion I", curso.getNombre());
        LOG.info("Finalizado test de datos completos.");
    }


    @Test
    public void registrarEstudiante(){
        LOG.info("Iniciando test de datos completos.");
        Curso curso = new Curso("Programacion I");
        Estudiante estudiante = new Estudiante("Geraldine", "Londoño Torres", "109453264", "geraldine@uniquindio.edu.co",
                "315635674", 18);
        curso.registrarEstudiante(estudiante);
        LOG.info("Finalizado test de datos completos.");
    }





    
}
