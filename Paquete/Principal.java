package Paquete;

public class Principal {
    public static void main(String[] args) {
        //crear un objeto a partir de una clase

        PAIS p1 = new PAIS();
        p1.setPoblacion("joven");
        p1.setNacionalidad("Mexicana");
        p1.setContinente("Americano");

        p1.mostrarInfo();


    }
}
