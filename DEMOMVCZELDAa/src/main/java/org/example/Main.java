package org.example;

import org.example.Controlador.ControladorZelda;
import org.example.Modelo.L;
import org.example.Modelo.Zelda;
import org.example.PPPER.DLZeldaDB;
import org.example.PPPER.ZeldaDAO;
import org.example.Vista.VentanaZelda;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //VENTANA
        VentanaZelda view = new VentanaZelda("trabajo FFF");

        //INSERTAR
       DLZeldaDB DLZ = new DLZeldaDB();
//        L l = new L(0, "No sé que hacer","AAAAA",2, "WOSHJ", "YA ME HARTÉ");
//        if (DLZ.insertarZelda(l)){
//            System.out.println("SI SALIÓ BN");
//        }else{
//            System.out.println("YA BASTAA");
//        }
//
//        //System.out.println(DLZ.buscarZeldaporID(5));
//
//        //UPDATE
//
//        ZeldaDAO Zdao = new ZeldaDAO();
//        L l1 = new L(6,"AAAA","YA QUIERO ACAABAR",9, "0 ESTRELLAS", "GOOGLE");
//
//        try {
//            if (Zdao.Update(l)){
//                System.out.println("Sí se pudo actualizar");
//            }else {
//                System.out.println("no se pudo actualizar");
//            }
//        }catch (SQLException sqle){
//            System.out.println("ERROR al actualizar");
//        }

        //DELETE

        ZeldaDAO zdao = new ZeldaDAO();
        try {
            if (zdao.Delete("1")){
                System.out.println("Si Se BoRR00 BIEN");
            }else {
                System.out.println("no se pudo eliminar");
            }
        }catch (SQLException sqle){
            System.out.println("Error Sl borrar");
            System.out.println(sqle.getMessage());
        }

        //buscar tod0o
        System.out.println("---------------------");
        for (L tmp: DLZ.obtenerTodo()) {
            System.out.println("JJuegos: " + tmp);
            System.out.println("DURAXXXXION: " + tmp.getDuracion());

        }

        ControladorZelda controller = new ControladorZelda(view);

    }
}