package org.example.Controlador;

import org.example.Modelo.L;
import org.example.Modelo.ModeloTablaZelda;
import org.example.Vista.VentanaZelda;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorZelda extends MouseAdapter {
    private VentanaZelda view;
    private ModeloTablaZelda modelo;

    public ControladorZelda(VentanaZelda view) {
        this.view = view;
        modelo = new ModeloTablaZelda();
        this.view.getTabla().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBotonAdd().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
            modelo.CargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
        //DE ESTÉ IF TOMÉ LO DEL VIEW.TABLA
        if (e.getSource() == this.view.getBotonAdd()){

            }
            L l= new L();
            l.setID(0);
            l.setPlataforma(this.view.getTxtPlataforma().getText());
            l.setNombre(this.view.getTxtNombre().getText());
            l.setDuracion(Double.parseDouble(this.view.getTxtDuracion().getText()));
            l.setCalificacion(this.view.getTxtCalificacion().getText());
            l.setURL(this.view.getLblImagencompu().getText());

            if (modelo.agregarJuego(l)){
                JOptionPane.showMessageDialog(view, "se pudo agregar bn", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"no S33 PUDO AGREGAR A LA BASE DE DATOS", "ERROR AL INSERTAR", JOptionPane.ERROR_MESSAGE);

            }

            //ESTE IF LO AGRRGUÉ PENSANDO QUE PODRÍA AYUDAR PARA QUE MOSTRARA LA IMAGEN, PERO NO
            //EL IF LO TOMÉ DE ACÁ
            if (e.getSource() == view.getTabla()){
                int index = this.view.getTabla().getSelectedRow();
                L tmp = modelo.getZeldaAtIndex(index);
                try {
                    this.view.getLblImagencompu().setIcon(tmp.getImagen());
                }catch (MalformedURLException mfue){
                    System.out.println(e.toString());
            }
                //ESTO ES LO DE LIMPIAR EN LA VENTANA
            this.view.limpiar();


        }
    }

}
