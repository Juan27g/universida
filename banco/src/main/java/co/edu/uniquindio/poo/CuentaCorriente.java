package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria {
    
    public double sobreGiro;

    public CuentaCorriente( int numeroCuenta, double saldo, boolean estado, Titular titular, double sobreGiro) {
        super(numeroCuenta, saldo, estado, titular);
        this.sobreGiro = sobreGiro;
    }

    public double getSobreGiro() {
        return sobreGiro;
    }

    public void setSobreGiro(double sobreGiro) {
        this.sobreGiro = sobreGiro;
    }

    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= saldo + sobreGiro;
        saldo = saldo- valor;
        if (saldo <= 0){
            sobreGiro= sobreGiro+ saldo;
            estado = false;
        }
    }
}