package Modelo;

import java.time.LocalDate;
import java.util.Arrays;

public class Campeonato {
    private String ID;
    private String Nombre;
    private LocalDate Fecha_inicio;
    private String estado;

    // Array con los estados válidos
    private static final String[] ESTADOS_VALIDOS = {"Inscripción", "Curso", "Finalizado"};

    public Campeonato(String ID, String nombre, LocalDate fecha_inicio, String estado) {
        this.ID = ID;
        Nombre = nombre;
        Fecha_inicio = fecha_inicio;
        setEstado(estado); // Se usa el setter para validar el estado
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        Fecha_inicio = fecha_inicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        // Validar si el estado está en el array de estados válidos
        if (Arrays.asList(ESTADOS_VALIDOS).contains(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido. Debe ser 'Inscripción', 'Curso' o 'Finalizado'.");
        }
    }
}
