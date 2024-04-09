package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica{
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        assert base>0;
        this.altura = altura;
        assert altura>0;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    
}
