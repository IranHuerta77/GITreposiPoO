package Paquete;

public class Computadora {
    //Atributos
    String color;
    String marca;
    String Ram;
    String Calidad;

    public Computadora(String color) {
        this.color = color;
    }

    public Computadora() {
        this.color = color;
        this.marca = marca;
        String ram;
        Ram = Ram;
        Calidad = Calidad;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getRam() {
        return Ram;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public void setCalidad(String calidad) {
        Calidad = calidad;
    }

    //metodo información
    public void mostrarInfo(){
        System.out.println("La información de la computadora es: ");
        System.out.println("color: " + getColor());
        System.out.println("marca: " + getMarca());
        System.out.println("RAM:" + getRam());
        System.out.println("calidad: " + getCalidad());

    }

}
