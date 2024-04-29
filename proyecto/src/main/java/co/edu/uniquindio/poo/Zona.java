package co.edu.uniquindio.poo;

import java.util.Collection;

import javafx.scene.paint.Material;

public class Zona {
    private final String nombre;
    private final FiguraGeometrica figuraGeometrica;
    private final Material material;

    public Zona(String nombre, FiguraGeometrica figuraGeometrica, Material material) {
        this.nombre = nombre;
        this.figuraGeometrica= figuraGeometrica;
        this.material = material;
    }
    

    public String getNombre() {
        return nombre;
    }

    public FiguraGeometrica getFiguraGeometrica() {
        return figuraGeometrica;
    }
    public Material getMaterial() {
        return material;
    }

    public double calcularValor() {
        return figuraGeometrica.calcularArea() * material.getValorMetroCuadrado();
    }

    


}
