package Paquete;

public class BALON {
    String colores;
    String forma;
    double medidas;

    public BALON(String colores) {
        this.colores = colores;
    }

    public BALON(String colores, String forma, double medidas) {
        this.colores = colores;
        this.forma = forma;
        this.medidas = medidas;
    }

    public BALON() {

    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setmedidas(double medidas) {
        this.medidas = medidas;
    }

    public String getColores() {
        return colores;
    }

    public String getForma() {
        return forma;
    }

    public double getMedidas() {
        return medidas;
    }

    //metodo info
    public void mostrarInfo(){
        System.out.println("Su color o colores son: " +  getColores());
        System.out.println("Su forma es: " +  getForma());
        System.out.println("Sus medidas son: " + getMedidas());
    }

    public void setmedidas(String s) {
    }
}
