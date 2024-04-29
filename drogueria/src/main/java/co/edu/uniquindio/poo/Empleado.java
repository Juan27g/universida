package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private final double salario;

    
    public Empleado(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }


}
