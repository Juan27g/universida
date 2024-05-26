package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero(5);


        Vehiculo carro = new Carro("ABC123", "Mazda", new Propietario("Juan", "1928192"));

        Vehiculo moto = new Moto("ACD343", "Yamaha", new Propietario("Juana", "178162"), TipoMoto.CLASICA, 150);
        Vehiculo moto2 = new Moto("ACD333", "Yamaha", new Propietario("Camila", "178162"), TipoMoto.HIBRIDA, 140);



        parqueadero.configurarTarifasPorHora(300, 150, 200);



        parqueadero.ubicarVehiculo(0, 0, carro);
        Propietario propietario1 = parqueadero.identificarPropietario(0, 0);
        if (propietario1 != null) {
        System.out.println("El propietario del vehículo en el puesto (0, 0) es: " + propietario1.getNombre());
        } else {
        System.out.println("No hay vehículo estacionado en el puesto (0, 0)");
        }

        parqueadero.ubicarVehiculo(1, 1, moto);
        Propietario propietario2 = parqueadero.identificarPropietario(1, 1);
        if (propietario2 != null) {
        System.out.println("El propietario del vehículo en el puesto (1, 1) es: " + propietario2.getNombre());
        } else {
        System.out.println("No hay vehículo estacionado en el puesto (1, 1)");
        }

        parqueadero.ubicarVehiculo(2, 2, moto2);
        Propietario propietario3 = parqueadero.identificarPropietario(2, 2);
        if (propietario3 != null) {
        System.out.println("El propietario del vehículo en el puesto (2, 2) es: " + propietario3.getNombre());
        } else {
        System.out.println("No hay vehículo estacionado en el puesto (2, 2)");
        }



        JOptionPane.showMessageDialog(null, "Por favor esperar");



        parqueadero.liberarPuesto(0, 0);

        parqueadero.liberarPuesto(1, 1);
        parqueadero.liberarPuesto(2, 2);



        parqueadero.generarReporteDiario();

        
        parqueadero.generarReporteMensual();

        


    }
}
