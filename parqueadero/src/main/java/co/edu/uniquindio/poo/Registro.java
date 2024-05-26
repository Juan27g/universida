package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Registro {
    private Vehiculo vehiculo;
    private Puesto puesto;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;

    public Registro(Vehiculo vehiculo, Puesto puesto) {
        this.vehiculo = vehiculo;
        this.puesto = puesto;
        this.horaIngreso = LocalDateTime.now();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double calcularCosto() {
        if (horaSalida != null) {
            long horas = java.time.Duration.between(horaIngreso, horaSalida).toHours();
            return horas * vehiculo.getTarifaPorHora();
        }
        return 0;
    }
}
