package co.edu.uniquindio.poo;


public class Moto extends Vehiculo {
    private TipoMoto tipoMoto;
    private double velocidadMaxima;
    private static double tarifaClasica;
    private static double tarifaHibrida;

    public Moto(String placa, String modelo, Propietario propietario, TipoMoto tipoMoto, double velocidadMaxima) {
        super(placa, modelo, propietario);
        this.tipoMoto = tipoMoto;
        this.velocidadMaxima = velocidadMaxima;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public static void setTarifaClasica(double tarifa) {
        tarifaClasica = tarifa;
    }

    public static void setTarifaHibrida(double tarifa) {
        tarifaHibrida = tarifa;
    }

    @Override
    public double getTarifaPorHora() {
        return tipoMoto == TipoMoto.CLASICA ? tarifaClasica : tarifaHibrida;
    }
}
