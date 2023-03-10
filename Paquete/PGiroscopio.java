package Paquete;

public class PGiroscopio {
    public static void main(String[] args) {
        //crear objeto de la clase

        Giroscopio g1 = new Giroscopio();
        g1.setBase("Sí tiene");
        g1.setColor("rojo");
        g1.setmedidas("1.1");

        g1.mostrarInfo();
    }
}
