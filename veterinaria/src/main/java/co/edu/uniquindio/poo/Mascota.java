package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
    public Mascota{

        assert nombre !=null;
        assert nombre !="";
        assert especie !=null;
        assert edad>0.0;
        assert raza !=null;
        assert genero !=null;
        assert color != null;
        assert peso >= 0.0;



    }
}
