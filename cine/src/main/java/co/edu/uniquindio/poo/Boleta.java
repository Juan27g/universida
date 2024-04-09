package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record Boleta(String nombre, LocalDateTime fechaHora,  Double valor) {
    
}
