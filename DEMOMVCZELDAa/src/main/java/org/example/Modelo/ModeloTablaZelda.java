package org.example.Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaZelda implements TableModel {
    private ArrayList<Zelda>datos;
    public static final int COLS = 6;

    public ModeloTablaZelda() {
        datos = new ArrayList<>();
    }

    public ModeloTablaZelda(ArrayList<Zelda> datos) {
        this.datos = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol = "";
        switch (columnIndex){
            case 0:
                nombreCol = "Id";
                break;
            case 1:
                nombreCol = "Plataforma";
                break;

            case 2:
                nombreCol = "Nombre";
                break;
            case 3:
                nombreCol = "Duración (en HyM)";
                break;
            case 4:
                nombreCol = "Calificación";
                break;
            case 5:
                nombreCol = "URL";
                break;

            default:
                nombreCol = "";
        }

        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Double.class;
            case 3:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zelda tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getPlataforma();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getDuracion();
            case 3:
                return tmp.getCalificacion();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setPlataforma((String) aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setDuracion((Double) aValue);
                break;
            case 3:
                datos.get(rowIndex).setCalificacion((String) aValue);
                break;

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void agregarZelda(Zelda zeld){
        datos.add(zeld);
    }
}
