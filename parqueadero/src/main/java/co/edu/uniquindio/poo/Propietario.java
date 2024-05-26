package co.edu.uniquindio.poo;

public class Propietario {
    private String nombre;
    private String documentoIdentidad;

    public Propietario(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}
