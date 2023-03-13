package TAREA6;

public class Automovil {
    String Color;
    String Marca;
    String Modelo;
    String Contado;
    String  Agencia;

    public Automovil(String color) {
        Color = color;
    }

    public Automovil(String color, String marca, String modelo, String contado, String agencia) {
        Color = color;
        Marca = marca;
        Modelo = modelo;
        Contado = contado;
        Agencia = agencia;
    }

    public Automovil() {

    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setContado(String contado) {
        Contado = contado;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getColor() {
        return Color;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getContado() {
        return Contado;
    }

    public String getAgencia() {
        return Agencia;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Color='" + Color + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Contado='" + Contado + '\'' +
                ", Agencia='" + Agencia + '\'' +
                '}';
    }

    //metodo
    public void mostrarInfo(){
        System.out.println("El color del carro es: " + getColor());
        System.out.println("¿De qué marca es? " + getMarca());
        System.out.println("¿Qué modelo es? " + getModelo());
        System.out.println("¿Lo pagaron de contado?" + getContado());
        System.out.println("¿Lo sacaron de agencia?" + getAgencia());

    }





}



