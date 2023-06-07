package org.example.PPPER;

import org.example.Modelo.L;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ZeldaDAO implements InterfazDAO{
    public ZeldaDAO() {
    }
    @Override
    public boolean insertarZelda(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Zelda(PLATAFORMA, NOMBRE, DURACION, CALIFICACION, URL) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = Csingle.getInstance("ZELdaDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((L)obj).getPlataforma());
        pstm.setString(2, ((L)obj).getNombre());
        pstm.setDouble(3, ((L)obj).getDuracion());
        pstm.setString(4, ((L)obj).getCalificacion());
        pstm.setString(5, ((L)obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    //ESTO ES PARA ACTUALIZAR LOS DATOS
    @Override
    public boolean Update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Zelda SET PLATAFORMA = ?, NOMBRE = ?, DURACION = ?, CALIFICACION = ?, URL = ? WHERE ID = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = Csingle.getInstance("ZELdaDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((L)obj).getPlataforma());
        pstm.setString(2, ((L)obj).getNombre());
        pstm.setDouble(3, ((L)obj).getDuracion());
        pstm.setString(4, ((L)obj).getCalificacion());
        pstm.setString(5, ((L)obj).getURL());
        pstm.setInt(6,((L)obj).getID());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    //AQUÍ ES PARA BORRAR LOS DATOS BUSCANDOLOS POR EL ID
    @Override
    public boolean Delete(String ID) throws SQLException {
        String sqlDelete = "DELETE FROM Zelda WHERE ID = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = Csingle.getInstance("ZELdaDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(ID));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    //LO
    @Override
    public Object buscarZeldaporID(String ID) throws SQLException {
        String sql = "SELECTED * FROM Zelda WHERE ID = ? ;";
        L l = null;
            PreparedStatement pstm = Csingle.getInstance("ZeldaDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(ID));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                l = new L(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6) );
            }

        return l;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Zelda";
        ArrayList<L> resultado = new ArrayList<>();
            Statement stm = Csingle.getInstance("ZELdaDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new L(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getDouble(4), rst.getString(5), rst.getString(6) ));
            }

        return resultado;
    }
}
