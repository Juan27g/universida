package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
    public double largo;
    public double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        assert largo>0;
        this.ancho = ancho;
        assert ancho>0;
    }

    @Override
    public double calcularArea(){
        return largo*ancho;
    }
    
    
}
