package com.example.openstreemapexample;

import org.osmdroid.util.GeoPoint;

public class Lugar {
    private double latitud;
    private double longitud;
    private String nombre;
    private String descripcion;
    private GeoPoint punto;

    public Lugar(double latitud, double longitud, String nombre, String descripcion) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punto = new GeoPoint(latitud,longitud);
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GeoPoint getPunto() {
        return punto;
    }

    public void setPunto(GeoPoint punto) {
        this.punto = punto;
    }
}
