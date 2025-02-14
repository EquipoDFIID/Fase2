package Modelo;

import java.util.ArrayList;

public class CampeonatoDao {
    static ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public static void  agregarCampeonato(Campeonato campeonato){
        campeonatos.add(campeonato);
    }

}
