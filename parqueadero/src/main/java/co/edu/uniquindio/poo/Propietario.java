package co.edu.uniquindio.poo;

public class Propietario {
    // Nombre del propietario.
    private final String nombre;
    // Documento de identidad del propietario.
    private final String documentoIdentidad;

    /**
     * Constructor de la clase Propietario.
     *
     * @param nombre Nombre del propietario.
     * @param documentoIdentidad Documento de identidad del propietario.
     * @throws IllegalArgumentException Si el nombre o el documento de identidad son nulos o vacíos.
     */
    public Propietario(String nombre, String documentoIdentidad) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del propietario no puede ser nulo o vacío.");
        }
        if (documentoIdentidad == null || documentoIdentidad.isEmpty()) {
            throw new IllegalArgumentException("El documento de identidad del propietario no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    /**
     * Obtiene el nombre del propietario.
     *
     * @return El nombre del propietario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el documento de identidad del propietario.
     *
     * @return El documento de identidad del propietario.
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}