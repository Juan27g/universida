package co.edu.uniquindio.poo;

/**
 * Clase abstracta que representa un vehículo.
 */
public abstract class Vehiculo {
    protected String placa;
    protected String modelo;
    protected Propietario propietario;

    /**
     * Constructor de la clase Vehiculo.
     *
     * @param placa      La placa del vehículo.
     * @param modelo     El modelo del vehículo.
     * @param propietario El propietario del vehículo.
     */
    public Vehiculo(String placa, String modelo, Propietario propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    /**
     * Obtiene la placa del vehículo.
     *
     * @return La placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el propietario del vehículo.
     *
     * @return El propietario del vehículo.
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * Obtiene la tarifa por hora del vehículo.
     *
     * @return La tarifa por hora.
     */
    public abstract double getTarifaPorHora();
}
