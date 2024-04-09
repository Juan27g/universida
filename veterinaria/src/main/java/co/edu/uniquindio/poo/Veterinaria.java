
package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> ListaMascotas;

    public Veterinaria(String nombre) {
        assert nombre != null : "El nombre de la mascota no puede ser nulo";
        this.nombre = nombre;
        this.ListaMascotas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Mascota> getListaMascotas() {
        return Collections.unmodifiableCollection(ListaMascotas);
    }

    public void registrarMascota(Mascota mascota) {
        assert !verificarID(mascota.id()) : "Ya existe una mascota con el mismo ID" + mascota.id();
        ListaMascotas.add(mascota);
    }

    private boolean verificarID(String id) {
        boolean existeMascota = false;

        for (Mascota mascota : ListaMascotas) {
            if (mascota.id().equals(id)) {
                existeMascota = true;
            }
        }
        return existeMascota;
    }

    public List<Mascota> getMascotasMayoresDiez() {
        List<Mascota> mascotasMayoresDiez = new ArrayList<>();

        for (Mascota mascota : ListaMascotas) {
            if (mascota.edad() > 10) {
                mascotasMayoresDiez.add(mascota);
            }
        }

        return mascotasMayoresDiez;
    }

}
