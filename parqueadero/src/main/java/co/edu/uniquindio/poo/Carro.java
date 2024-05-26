package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    
    private static double tarifaPorHora;

    public Carro(String placa, String modelo, Propietario propietario) {
        super(placa, modelo, propietario);
    }

    public static void setTarifaPorHora(double tarifa) {
        tarifaPorHora = tarifa;
    }

    @Override
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
}


