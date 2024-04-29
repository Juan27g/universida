package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import javafx.print.Collation;

public class ParqueInfantil {
    public String nombre;
    public String descripcion;
    private final Municipio municipio;
    public Collection<Zona> zonas;


    public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
        this.descripcion = descripcion;
        this.municipio= municipio;
        this.zonas = new LinkedList<>();
    }

    public boolean verificarRepetido( String nombre){
        boolean existe = false;
        for (Zona zona : zonas){
            assert zona.getNombre()== nombre;
            existe= true;
        }
        return existe;
    }
    

    public void agregarZona( Zona zona){
        assert verificarRepetido(zona.getNombre())==false;
        zonas.add(zona);
    }

    public double calcularValor() {
        return zonas.stream().mapToDouble(n -> n.calcularValor()).sum() + municipio.getSobrecosto();
    }



    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }









}
