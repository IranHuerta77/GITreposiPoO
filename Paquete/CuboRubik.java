package Paquete;

public class CuboRubik {
    String colores;
    String Forma;
    String Lados;
    String Facil;

    public CuboRubik() {
        this.colores = colores;
    }

    public CuboRubik(String colores, String forma, int lados, String facil) {
        this.colores = colores;
        Forma = forma;
        Lados = Lados;
        Facil = facil;
    }

    public String getColores() {
        return colores;
    }

    public String getForma() {
        return Forma;
    }

    public String getLados() {
        return Lados;
    }

    public String getFacil() {
        return Facil;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public void setForma(String forma) {
        Forma = forma;
    }

    public void setLados(int lados) {
        Lados = Lados;
    }

    public void setFacil(String facil) {
        Facil = facil;
    }
    //metodo info
    public void mostrarInfo(){
        System.out.println("la información de la computadora es:");
        System.out.println("Colores: " + getColores());
        System.out.println("forma: " + getForma());
        System.out.println("lados: " + getLados());
        System.out.println("facil: " + getFacil());
    }


    public void setLados(String s) {
    }

}
