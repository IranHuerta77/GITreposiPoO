package TAREA6;

public class KPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.setPelo("el color de mi cabello es negro");
        p1.setOjos("El color de mis ojos es café");
        p1.setEdad(20.0);
        p1.setNombre("Me llamo Iran");
        p1.setNacionalidad("Mi nacionalidad es Mexicana");
        p1.setGenero("Masculino");

        p1.mostrarInfo();
    }
}
