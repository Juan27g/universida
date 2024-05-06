package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final int numeroCuenta;
    protected double saldo;
    protected boolean estado;
    private final Titular titular;
    public Collection<Transaccion> listaTransacciones;


    public CuentaBancaria(int numeroCuenta, double saldo, boolean estado, Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.titular= titular;
        this.listaTransacciones= new LinkedList<Transaccion>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
     
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public Titular getTitular() {
        return titular;
    }
    

    public void depositar(double valor){
        assert valor>0;
        saldo= saldo+valor;
        estado=true;
    }

    public double consultarSaldo(){
        if (estado==true) {
            return saldo;
        } else {
            System.out.println("La cuenta se encuentra inactiva");
            return saldo;
        }
    }

    public abstract void retirar(double valor);

    public void agregarTransaccion(Transaccion transaccion) {
        listaTransacciones.add(transaccion);
       }
    

       public void transferir(double valor, CuentaBancaria cuentaDestino) {
        if (this.saldo >= valor && this.estado){
            this.saldo = saldo - valor;
            cuentaDestino.depositar(valor);
        }
    }

    public void verificarExistenciaCuenta(int numeroCuentaBuscado) {
        if (this.numeroCuenta == numeroCuentaBuscado) {
            System.out.println("La cuenta con el número " + numeroCuentaBuscado + " existe.");
        } else {
            System.out.println("La cuenta con el número " + numeroCuentaBuscado + " no existe.");
        }
    }
    public boolean estaActiva(CuentaBancaria cuenta) {
        return cuenta.getSaldo() > 0;
    }

    
    
    







    

    
    
}
