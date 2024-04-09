package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraGeometrica {
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        assert lado>0;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    
}
