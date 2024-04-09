package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000), GRAMA_SINTETICA(35000), GRAMA_NATURAL(20000), ASFALTO(40000);



    final double valorMetroCuadrado;
    private Material( double valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

}
