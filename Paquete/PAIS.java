package Paquete;

public class PAIS {
    //Atributos
    String poblacion;
    String nacionalidad;
    String continente;

    public PAIS(String poblacion) {
        this.poblacion = poblacion;
    }

    public PAIS() {
        this.poblacion = poblacion;
        this.nacionalidad = nacionalidad;
        this.continente = continente;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getContinente() {
        return continente;
    }

    //Metodo para obtener la info de los atributos
    public void mostrarInfo(){
        System.out.println("La información del pais es: ");
        System.out.println("población:" + getPoblacion());
        System.out.println("nacionalidad:" + getNacionalidad());
        System.out.println("continente" + getContinente());
    }
}
