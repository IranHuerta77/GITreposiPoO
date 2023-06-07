package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaZelda extends JFrame {
    private JLabel lblPlataforma;
    private JLabel lblNombre;
    private JLabel lblDuracion;
    private JLabel lblCalificacion;
    private JLabel lblURL;
    private JTextField txtPlataforma;
    private JTextField txtNombre;
    private JTextField txtDuracion;
    private JTextField txtCalificacion;
    private JTextField txtURL;

    private JButton botonAdd;
    private JButton btnCargar;
    private JTable tabla;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel lblImagencompu;


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
        lblURL = new JLabel("URL: ");
        txtPlataforma = new JTextField(10);
        txtNombre = new JTextField(10);
        txtDuracion = new JTextField(15);
        txtCalificacion = new JTextField(10);
        txtURL = new JTextField(30);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblDuracion);
        panel1.add(txtDuracion);
        panel1.add(lblCalificacion);
        panel1.add(txtCalificacion);
        panel1.add(lblURL);
        panel1.add(txtURL);
        botonAdd = new JButton("Agregar");
        panel1.add(botonAdd);







        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(238, 79, 79));
        btnCargar = new JButton("CARGAR");
        panel2.add(btnCargar);

        tabla = new JTable();
        scrollPane = new JScrollPane(tabla);
        panel2.add(scrollPane);


        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(167, 47, 194));
        lblImagencompu = new JLabel("lblImagencompu");
        panel3.add(lblImagencompu);


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

    public JLabel getLblPlataforma() {
        return lblPlataforma;
    }

    public void setLblPlataforma(JLabel lblPlataforma) {
        this.lblPlataforma = lblPlataforma;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblDuracion() {
        return lblDuracion;
    }

    public void setLblDuracion(JLabel lblDuracion) {
        this.lblDuracion = lblDuracion;
    }

    public JLabel getLblCalificacion() {
        return lblCalificacion;
    }

    public void setLblCalificacion(JLabel lblCalificacion) {
        this.lblCalificacion = lblCalificacion;
    }

    public JTextField getTxtPlataforma() {
        return txtPlataforma;
    }

    public void setTxtPlataforma(JTextField txtPlataforma) {
        this.txtPlataforma = txtPlataforma;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtDuracion() {
        return txtDuracion;
    }

    public void setTxtDuracion(JTextField txtDuracion) {
        this.txtDuracion = txtDuracion;
    }

    public JTextField getTxtCalificacion() {
        return txtCalificacion;
    }

    public void setTxtCalificacion(JTextField txtCalificacion) {
        this.txtCalificacion = txtCalificacion;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(JButton botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblImagencompu() {
        return lblImagencompu;
    }

    public void setLblImagencompu(JLabel lblImagencompu) {
        this.lblImagencompu = lblImagencompu;
    }

    //ESTO ES PRA QUE LOS CAMPOS EN LOS QUE SE LLENAN LOS DATOS SE LIMPIEN DESPUES DE DARLE EN AGREGAR
    public void limpiar(){
        txtPlataforma.setText("");
        txtNombre.setText("");
        txtDuracion.setText("");
        txtCalificacion.setText("");
        txtURL.setText("");
    }
}

