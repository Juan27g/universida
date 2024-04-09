package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {
    private final String nombre;
    private final Collection<ParqueInfantil> parquesinfantiles;
    public Collection<Municipio> municipioUnico;
    
    
    public Proyecto(String nombre) {
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
        parquesinfantiles = new LinkedList<>();
        municipioUnico = new LinkedList<>();
    }

    public void agregarMunicipio(Municipio municipio){
        assert municipioUnico.size()==0;
        municipioUnico.add(municipio);
    }



    public Collection<Municipio> getMunicipio() {
        return municipioUnico;
    }

    
}
