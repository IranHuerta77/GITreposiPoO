package org.example.PPPER;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDAO {
    //ESTO ES PARA LA INTERFAZ
    public abstract boolean insertarZelda(Object obj)throws SQLException;

    public abstract boolean Update(Object obj)throws SQLException;
    public abstract boolean Delete(String  ID)throws SQLException;
    public abstract Object buscarZeldaporID(String ID)throws SQLException;
    public abstract ArrayList obtenerTodo( ) throws SQLException;



}
