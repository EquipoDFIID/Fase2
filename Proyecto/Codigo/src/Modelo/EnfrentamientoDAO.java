package Modelo;

import java.util.ArrayList;
import java.util.List;

public class EnfrentamientoDAO {
    static List<Enfrentamiento> enfrentamientos=new ArrayList<>();

    public static void agregarEnfrentamientos (Enfrentamiento enfrentamiento){
        enfrentamientos.add(enfrentamiento);
    }

}