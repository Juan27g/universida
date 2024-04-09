package co.edu.uniquindio.poo;

import java.util.Collection;

import javafx.scene.paint.Material;

public class Zona {
    public String nombre;
    private final Collection<FiguraGeometrica> figuraGeometrica;
    private Material material;

    public Zona(String nombre, Collection<FiguraGeometrica> figuraGeometrica, Material mateorial) {
        this.nombre = nombre;
        this.figuraGeometrica = figuraGeometrica;
        this.material = mateorial;
    }
    

    public String getNombre() {
        return nombre;
    }
    public Collection<FiguraGeometrica> getFiguraGeometrica() {
        return figuraGeometrica;
    }
    public Material getMateorial() {
        return material;
    }

    


}
