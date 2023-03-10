package Paquete;

public class LAMPARA {
    String ColorLuz;
    String ColorLampara;
    String Marca;

    public LAMPARA() {
        ColorLuz = ColorLuz;
    }

    public LAMPARA(String colorLuz, String colorLampara, String marca) {
        ColorLuz = colorLuz;
        ColorLampara = colorLampara;
        Marca = marca;
    }

    public void setColorLuz(String colorLuz) {
        ColorLuz = colorLuz;
    }

    public void setColorLampara(String colorLampara) {
        ColorLampara = colorLampara;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColorLuz() {
        return ColorLuz;
    }

    public String getColorLampara() {
        return ColorLampara;
    }

    public String getMarca() {
        return Marca;
    }

    //metodo

    public void mostrarInfo() {

        System.out.println("El color de la luz es :" + getColorLuz());
        System.out.println("El color de la lampara es: " + getColorLampara());
        System.out.println("La marca de la lampara es: " + getMarca());

    }
}
