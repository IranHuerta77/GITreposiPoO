package Paquete;

public class PLibro {
    public static void main(String[] args) {
        //objeto
        LIBRO l1 = new LIBRO();
        l1.setTitulo("Los ojos de mi princesa");
        l1.setAutor("Carlos Cuauhtémoc Sánchez");
        l1.setColor("Azul");
        l1.setTipoLetra("Molde");
        l1.setDificultadLectura("si eres un lector constante, sino la dificultad es media");

        l1.mostrarInfo();
    }
}
