package org.example.Modelo;

public class Zelda {
    private int ID;
    private String Plataforma;
    private String Nombre;
    private double Duracion;
    private String Calificacion;
    private String URL;

    public Zelda() {
    }

    public Zelda(String plataforma, String nombre, double duracion, String calificacion) {
        Plataforma = plataforma;
        Nombre = nombre;
        Duracion = duracion;
        Calificacion = calificacion;
    }

    public Zelda(int ID, String plataforma, String nombre, double duracion, String calificacion, String URL) {
        this.ID = ID;
        Plataforma = plataforma;
        Nombre = nombre;
        Duracion = duracion;
        Calificacion = calificacion;
        this.URL = URL;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double duracion) {
        Duracion = duracion;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String calificacion) {
        Calificacion = calificacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Zelda{" +
                "ID=" + ID +
                ", Plataforma='" + Plataforma + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Duracion=" + Duracion +
                ", Calificacion='" + Calificacion + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
