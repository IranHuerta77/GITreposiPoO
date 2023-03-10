package Paquete;

public class PCuboR {
    public static void main(String[] args) {
        //crear objeto
        CuboRubik C1 = new CuboRubik();
        C1.setColores("Rojo, Blanco, Azul, Naranja");
        C1.setForma("Cubica");
        C1.setLados("Tiene 4 Lados");
        C1.setFacil("si se sabe armar sí.");

        C1.mostrarInfo();
    }
}
