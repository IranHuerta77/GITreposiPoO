package Paquete;

public class Giroscopio {
    //Atributos
    String color;
    String base;
    double medidas;

    public Giroscopio(String color) {
        this.color = color;
    }

    public Giroscopio(String color, String base, double medidas) {
        this.color = color;
        this.base = base;
        this.medidas = medidas;
    }

    public Giroscopio() {
        
    }

    public String getColor() {
        return color;
    }

    public String getBase() {
        return base;
    }

    public double getmedidas() {
        return medidas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setmedidas(double medidas) {
        this.medidas = medidas;
    }

    //metodo para obtener la información

    public void mostrarInfo(){
        System.out.println("La información del giroscopio es:");
        System.out.println("color: " + getColor());
        System.out.println("base: " + getBase());
        System.out.println("medidas: " + getmedidas());
    }

    public void setmedidas(String s) {
    }
}
