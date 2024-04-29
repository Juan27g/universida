package co.edu.uniquindio.poo;


public enum Material {
    ARENA(10000), GRAMA_SINTETICA(35000), GRAMA_NATURAL(20000), ASFALTO(40000);

    private final double valorMetroCuadrado;

    /**
     * Método constructor de la clase tipo enumeración
     * 
     * @param valorMetroCuadrado valor del metro cuadrado del material
     */
    private Material(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    /**
     * Método para obtener el valor del metro cuadrado del material
     * 
     * @return valor del metro cuadrado del material
     */
    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }





}
