package org.example.Controlador;

import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("Exito.png");
            JOptionPane.showMessageDialog(view,
                    "holas desde el ejemplo",
                    "titulo personalizado",
                    JOptionPane.INFORMATION_MESSAGE,
                    icono
                    );
        }
        if (e.getSource() == view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view, "ejemplo de entrada",
                    "titulo personalizado",
                    JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }
        if (e.getSource() == view.getBtnOpcion()){
            //System.out.println("Opción");
            int respuesta = JOptionPane.showConfirmDialog(view, "¿estas seguro de borrar?",
            "confirmacion",
            JOptionPane.YES_OPTION
            );

        if (respuesta == JOptionPane.YES_OPTION){
            view.getLblResultado().setText("Elegistge opcion SI");

        } else {
            view.getLblResultado().setText("Elegistge opcion NO");

        }

        }
    }
}
