package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaZelda extends JFrame {
    private JLabel lblPlataforma;
    private JLabel lblNombre;
    private JLabel lblDuracion;
    private JLabel lblCalificacion;
    private JTextField txtPlataforma;
    private JTextField txtNombre;
    private JTextField txtDuracion;
    private JTextField txtCalificacion;
    private JButton botonAdd;
    private JTable tabla;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public VentanaZelda(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(74, 187, 179));
        lblPlataforma = new JLabel("Plataforma");
        lblNombre = new JLabel("Nombre");
        lblDuracion = new JLabel("Duracion");
        lblCalificacion = new JLabel("Calificacion");
        txtPlataforma = new JTextField(10);
        txtNombre = new JTextField(10);
        txtDuracion = new JTextField(15);
        txtCalificacion = new JTextField(10);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblDuracion);
        panel1.add(txtDuracion);
        panel1.add(lblCalificacion);
        panel1.add(txtCalificacion);
        botonAdd = new JButton("Agregar");
        panel1.add(botonAdd);







        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(238, 79, 79));

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(167, 47, 194));

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(87, 154, 59));



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
