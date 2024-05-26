package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicaciones {

    private final String nombre;
    private EquipoElectronica[] ListaEquiposElectronicos;
    private CentroImpresion CentroImpresion;
    private ArrayList<Publicaciones> solucitudes;


    public OficinaPublicaciones(String nombre) {
        this.nombre = nombre;
        ListaEquiposElectronicos = new EquipoElectronico[5];
        CentroImpresion = new CentroImpresion("Centrico de impresion");
        this.solucitudes = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }


    public EquipoElectronica[] getListaEquiposElectronicos() {
        return ListaEquiposElectronicos;
    }


    public void setListaEquiposElectronicos(EquipoElectronica[] listaEquiposElectronicos) {
        ListaEquiposElectronicos = listaEquiposElectronicos;
    }


    public CentroImpresion getCentroImpresion() {
        return CentroImpresion;
    }


    public void setCentroImpresion(CentroImpresion centroImpresion) {
        CentroImpresion = centroImpresion;
    }


    public ArrayList<Publicaciones> getSolucitudes() {
        return solucitudes;
    }


    public void setSolucitudes(ArrayList<Publicaciones> solucitudes) {
        this.solucitudes = solucitudes;
    }


    @Override
    public String toString() {
        return "OficinaPublicaciones [nombre=" + nombre + ", ListaEquiposElectronicos="
                + Arrays.toString(ListaEquiposElectronicos) + ", CentroImpresion=" + CentroImpresion + ", solucitudes="
                + solucitudes + "]";
    }

    public void imprimirPublicacion(Publicacion publicacion){

    }

    

    


    
    
}
