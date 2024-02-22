package co.edu.uniquindio.poo;

public record Perroo(String nombre, String raza) {
    public Perroo{


    }
    public void caminar(int metros){
        System.out.println("El perro caminó "+metros+" metros");
    }

}


