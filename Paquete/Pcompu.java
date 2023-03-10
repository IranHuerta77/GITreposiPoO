package Paquete;

public class Pcompu {
    public static void main(String[] args) {
        // Crear objeto de la clase
        Computadora c1 = new Computadora();
        c1.setColor("Rosa");
        c1.setMarca("HP");
        c1.setRam("Sí es de buena capacidad");
        c1.setCalidad("Sí es de buena calidad");

        c1.mostrarInfo();
    }
}
