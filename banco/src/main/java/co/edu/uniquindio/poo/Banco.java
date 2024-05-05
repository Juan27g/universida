package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    public Collection<CuentaBancaria> listaCuentasBancarias;
    public  Collection<Titular> listaTitulares;


    
    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentasBancarias = new LinkedList<>();
        this.listaTitulares = new LinkedList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }

    public Collection<CuentaBancaria> getListaCuentasBancarias() {
        return listaCuentasBancarias;
    }
   
}
