package org.example.persistencia;

import org.example.modelo.Libro;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO implements InterfazDAO{

    public LibroDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT libros (titulo,autor) VALUES(?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Libro)obj).getTitulo());
        pstm.setString(2, ((Libro)obj).getAutor());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUPDATE = "UPDATE libros SET titulo = ?, autor = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlUPDATE);
        pstm.setString(1, ((Libro)obj).getTitulo());
        pstm.setString(2, ((Libro)obj).getAutor());
        pstm.setInt(3, ((Libro)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
        return false;
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String sqlDelete = "DELETE FROM libros WHERE id = ? ;";
        int roudCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        roudCount = pstm.executeUpdate();

        return roudCount > 0;
    }

    @Override
    public ArrayList ObtenerTodo() throws SQLException {
        String sql = "SELECT + FROM libros";
        ArrayList<Libro> resultado = new ArrayList<>();
            Statement stm = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1), rst.getString(2), rst.getString(3)));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT + FROM libros WHERE id = ?:";
        Libro libro = null;
            PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                libro = new Libro(rst.getInt(1), rst.getString(2), rst.getString(3));
            }
        return libro;
    }

}
