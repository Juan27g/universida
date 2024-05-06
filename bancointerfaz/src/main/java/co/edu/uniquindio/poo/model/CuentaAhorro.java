package co.edu.uniquindio.poo.model;

public class CuentaAhorro extends CuentaBancaria{
    private final double tasaInteres;

    public CuentaAhorro(int numeroCuenta, double saldo, boolean estado, Titular titular, double tasaInteres) {
        super(numeroCuenta, saldo, estado, titular);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    @Override
    public void retirar( double valor){
        assert valor>0; 
        assert valor<=saldo:"No tienes suficiente saldo para este retiro.";
        saldo= saldo-valor;
        if(saldo==0){
            estado= false;
        }
    }

    
    
}
