package org.example;

import org.example.Controlador.ControladorEjemplo;
import org.example.Vista.Ventana;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Ventana ventana = new Ventana("Ejemplo JOptionPane");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);

    }
}