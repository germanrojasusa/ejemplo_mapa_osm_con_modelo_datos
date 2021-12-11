package com.example.openstreemapexample;

import org.osmdroid.util.GeoPoint;

import java.util.ArrayList;

public class Lugares {
    ArrayList<Lugar> lugares;

    public Lugares() {
        lugares = new ArrayList<Lugar>();
        crearLugaresDeEjemplo();
    }
    void crearLugaresDeEjemplo(){
        lugares.add(new Lugar(5.401018,-73.335909, "Centro", "La descripción del centro"));
        lugares.add(new Lugar(5.400484,-73.3388383, "Palacio de Justicia", "La descripción del Palacio de Justicia"));
        lugares.add(new Lugar(5.401664,-73.3377543, "Gráficas de Boyacá", "La descripción de gráficas de Boyacá"));
    }
    ArrayList<Lugar> traerLugares(){
        return this.lugares;
    }
}
