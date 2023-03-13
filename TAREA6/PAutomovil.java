package TAREA6;

public class PAutomovil {
    public static void main(String[] args) {
        Automovil A1 = new Automovil();

        A1.setColor("Es de color rojo");
        A1.setMarca("Es Mazda");
        A1.setModelo("Mazda 3 2020");
        A1.setContado("Se pagó a credito");
        A1.setAgencia("Sí, es de agencia");

        A1.mostrarInfo();
    }
}
