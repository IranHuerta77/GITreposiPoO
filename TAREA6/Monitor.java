package TAREA6;

public class Monitor {
    String Color;
    String plana;
    String Tamaño;
    String Pulgadas;

    public Monitor() {
        Color = Color;
    }

    public Monitor(String color, String plana, String tamaño, String pulgadas) {
        Color = color;
        this.plana = plana;
        Tamaño = tamaño;
        Pulgadas = pulgadas;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPlana(String plana) {
        this.plana = plana;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public void setPulgadas(String pulgadas) {
        Pulgadas = pulgadas;
    }

    public String getColor() {
        return Color;
    }

    public String getPlana() {
        return plana;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getPulgadas() {
        return Pulgadas;
    }

    //metodo info

    public void mostrarInfo(){

        System.out.println("color: " + getColor());
        System.out.println("plana: " + getPlana());
        System.out.println("tamaño: " + getTamaño());
        System.out.println("pulgadas: " + getPulgadas());

    }


}
