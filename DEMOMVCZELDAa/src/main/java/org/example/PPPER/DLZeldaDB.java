package org.example.PPPER;

import org.example.Modelo.L;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DLZeldaDB {
    //preparedstatement

    public DLZeldaDB() {
    }
//METODO PARA INSERTAR
    public void insertStatement(){
        String laPlataforma = "PRUEBA ANTES DE";
        String elNombre = "PRUEBA ANTES DE";
        String laDuracion = "PRUEBA ANTES DE";
        String laCalificacion = "PRUEBA ANTES DE";
        String elURL  = "PRUEBA ANTES DE";

        try {
            Statement stm = Csingle.getInstance("ZELdaDB.db").getConnection().createStatement();

            String sqlInsert = "INSERT INTO Zelda(PLATAFORMA, NOMBRE, DURACION, CALIFICACION, URL) VALUES('"+laPlataforma+"','"+elNombre+"','"+laDuracion+"','"+laCalificacion+"','"+elURL+"')";
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("se insertaron " + rowCount + "registros");



        }catch (SQLException sqle){
            System.out.println("error al conectar"+ sqle.getMessage());
        }

    }
    //LO MISMO PERO CON STATEMENT(CREO)
    public void insertarPreparedStatement(){
        String laPlataforma = "PRUEBA COMO EN VIDEO";
        String elNombre = "PRUEBA COMO EN";
        String laDuracion = "PRUEBA COMO EN ";
        String laCalificacion = "PRUEBA COMO EN";
        String elURL  = "PRUEBA COMO EN";
        String sqlInsert = "INSERT INTO Zelda(PLATAFORMA, NOMBRE, DURACION, CALIFICACION, URL) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = Csingle.getInstance("ZELdaDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, laPlataforma);
            pstm.setString(2, elNombre);
            pstm.setString(3, laDuracion);
            pstm.setString(4, laCalificacion);
            pstm.setString(5, elURL);
            int rowCount = pstm.executeUpdate();
            System.out.println("se insertaron " + rowCount + "registros");

        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement "+ sqle.getMessage());
        }
    }

    //AQUÍ SE INSERTABA EL JUEGO Y SU INFORMACION
    public boolean insertarZelda (L l){
        String sqlInsert = "INSERT INTO Zelda(PLATAFORMA, NOMBRE, DURACION, CALIFICACION, URL) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = Csingle.getInstance("ZELdaDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, l.getPlataforma());
            pstm.setString(2, l.getNombre());
            pstm.setDouble(3, l.getDuracion());
            pstm.setString(4, l.getCalificacion());
            pstm.setString(5, l.getURL());
            rowCount = pstm.executeUpdate();
            System.out.println("se insertaron " + rowCount + "registros");

        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement "+ sqle.getMessage());
        }
        return  rowCount > 0;
    }

    //ESTO ERA PARA BUSCAR EL JUEGO POR EL ID
    public L buscarZeldaporID(int ID){
        String sql = "SELECT * FROM Zelda WHERE ID = ? ;";
        L l = null;
        try {
            PreparedStatement pstm = Csingle.getInstance("ZeldaDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, ID);
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                l = new L(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6) );
            }
        }catch (SQLException sqle){
            System.out.println("Error al buscar");
        }
        return l;
    }

    //ESTO ES PARA QUE MOSTRARATODO LO QUE HABIA EN LA BASE
    public ArrayList<L> obtenerTodo(){
        String sql = "SELECT * FROM Zelda";
        ArrayList<L> resultado = new ArrayList<>();
        try {
            Statement stm = Csingle.getInstance("ZELdaDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
               resultado.add(new L(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getDouble(4), rst.getString(5), rst.getString(6) ));
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
