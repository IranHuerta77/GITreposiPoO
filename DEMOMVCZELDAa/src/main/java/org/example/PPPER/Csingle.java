package org.example.PPPER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Csingle {
    private String baseDatos;
    public static Csingle _instance;
    private Connection connection;

    private Csingle(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Csingle getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new Csingle(baseDatos);
        }else{
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }


    public Connection getConnection() {
        return connection;
    }


}
