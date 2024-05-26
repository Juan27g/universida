package co.edu.uniquindio.poo;

/**
 * Clase que representa un puesto en el parqueadero.
 */
public class Puesto {
    private int i;
    private int j;
    private Vehiculo vehiculo;

    /**
     * Constructor de la clase Puesto.
     *
     * @param i La fila del puesto.
     * @param j La columna del puesto.
     */
    public Puesto(int i, int j) {
        this.i = i;
        this.j = j;
        this.vehiculo = null;
    }

    /**
     * Obtiene la fila del puesto.
     *
     * @return La fila del puesto.
     */
    public int getI() {
        return i;
    }

    /**
     * Obtiene la columna del puesto.
     *
     * @return La columna del puesto.
     */
    public int getJ() {
        return j;
    }

    /**
     * Verifica si el puesto está ocupado.
     *
     * @return True si el puesto está ocupado, false en caso contrario.
     */
    public boolean estaOcupado() {
        return vehiculo != null;
    }

    /**
     * Ocupa el puesto con un vehículo.
     *
     * @param vehiculo El vehículo que ocupará el puesto.
     */
    public void ocuparPuesto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Libera el puesto.
     */
    public void liberarPuesto() {
        this.vehiculo = null;
    }

    /**
     * Obtiene el vehículo que ocupa el puesto.
     *
     * @return El vehículo que ocupa el puesto.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}

