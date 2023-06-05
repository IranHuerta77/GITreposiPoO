package org.example.Modelo;

import org.example.PPPER.ZeldaDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaZelda implements TableModel {
    private ArrayList<L>datos;
    public static final int COLS = 6;
    private ZeldaDAO zdao;

    public ModeloTablaZelda() {
        datos = new ArrayList<>();
        zdao = new ZeldaDAO();

    }

    public ModeloTablaZelda(ArrayList<Zelda> datos) {
        this.datos = new ArrayList<>();
        zdao = new ZeldaDAO();
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
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
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
        L tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getID();
            case 1:
                return tmp.getPlataforma();
            case 2:
                return tmp.getNombre();
            case 3:
                return tmp.getDuracion();
            case 4:
                return tmp.getCalificacion();
            case 5:
                return tmp.getURL();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setID((int) aValue);
                break;
            case 1:
                datos.get(rowIndex).setPlataforma((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setDuracion((Double) aValue);
                break;
            case 4:
                datos.get(rowIndex).setCalificacion((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setURL((String) aValue);
                break;
            default:
                //System.out.println("NO Se modifica nada");


        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void CargarDatos(){
        try {
            ArrayList<L> tirar = zdao.obtenerTodo();
            System.out.println(tirar);
            datos = zdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }
    public boolean agregarJuego(L l){
        boolean resultado = false;
        try {
            if (zdao.insertarZelda(l)){
                datos.add(l);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public L getZeldaAtIndex(int idx){
        return datos.get(idx);

    }
}
