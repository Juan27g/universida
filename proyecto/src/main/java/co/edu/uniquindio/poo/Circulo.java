package co.edu.uniquindio.poo;//namespace

public class Circulo extends FiguraGeometrica {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
        assert radio>0;
    }
     
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }

    
    
}
