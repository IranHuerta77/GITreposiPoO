package Paquete;

public class GATO {
    String Raza;
    String Color;
    String TipoPelaje;
    String Ojos;
    String Tamaño;

    public GATO() {
        Raza = Raza;
    }

    public GATO(String Raza, String color, String tipoPelaje, String ojos, String tamaño) {
        Raza = Raza;
        Color = color;
        TipoPelaje = tipoPelaje;
        Ojos = ojos;
        Tamaño = tamaño;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setTipoPelaje(String tipoPelaje) {
        TipoPelaje = tipoPelaje;
    }

    public void setOjos(String ojos) {
        Ojos = ojos;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public String getRaza() {
        return Raza;
    }

    public String getColor() {
        return Color;
    }

    public String getTipoPelaje() {
        return TipoPelaje;
    }

    public String getOjos() {
        return Ojos;
    }

    public String getTamaño() {
        return Tamaño;
    }

    //metodo

    public void mostrarInfo(){

        System.out.println("La raza del gato es: " + getRaza());
        System.out.println("El color del gato es: " + getColor());
        System.out.println("El tipo de pelaje del gato es: " + getTipoPelaje());
        System.out.println("Sus ojos son de color: " + getOjos());
        System.out.println("El tamaño del gato es: " + getTamaño());
    }


}
