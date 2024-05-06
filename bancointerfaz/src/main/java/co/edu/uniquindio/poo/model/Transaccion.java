package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {
    private final int codigo;
    public double valor;
    private final LocalDate fecha;
    private final String descripcion;
    public boolean estado;
    public TipoTransaccion tipoTransaccion;
    
    public Transaccion(int codigo, double valor, LocalDate fecha, String descripcion, boolean estado,TipoTransaccion tipoTransaccion) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoTransaccion = tipoTransaccion;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getValor() {
        return valor;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }
    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    
}