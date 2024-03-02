package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class Curso{
    private final String nombre;;
    private final Collection<Estudiante> ListaEstudiante;

    public Curso(String nombre){
        this.nombre = nombre;
        this.ListaEstudiante = new LinkedList<Estudiante>();
    }

    public String getNombre(){
        return nombre;
    }

    public Collection<Estudiante> getListaEstudiante (){
        return Collections.unmodifiableCollection (ListaEstudiante);
    }

    public void registrarEstudiante(Estudiante estudiante) {
    assert verificarNumeroIdentificacion(estudiante.numeroIdentificacion())==false: "Ya existe un estudiante con ese número de identificación"+estudiante.numeroIdentificacion();
        ListaEstudiante.add(estudiante);
    }
    private boolean verificarNumeroIdentificacion(String numeroIdentificacionBuscar) {
        boolean  existeEstudiante = false;

        for (Estudiante estudiante : ListaEstudiante ) {
            if(estudiante.numeroIdentificacion().equals(numeroIdentificacionBuscar)){
                existeEstudiante = true;
            }
        }
        return existeEstudiante;
    }
}
