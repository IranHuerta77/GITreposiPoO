package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class L {
    private int ID;
    private String Plataforma;
    private String Nombre;
    private double Duracion;
    private String Calificacion;
    private String URL;

    public L() {
    }

    public L(int ID, String plataforma, String nombre, double duracion, String calificacion, String URL) {
        this.ID = ID;
        Plataforma = plataforma;
        Nombre = nombre;
        Duracion = duracion;
        Calificacion = calificacion;
        this.URL = URL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "L{" +
                "ID=" + ID +
                ", Plataforma='" + Plataforma + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Duracion=" + Duracion +
                ", Calificacion='" + Calificacion + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
    //ESTO ES PARA LA IMAGEN
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImage = new URL(this.URL);
        return new ImageIcon(urlImage);
    }
}
