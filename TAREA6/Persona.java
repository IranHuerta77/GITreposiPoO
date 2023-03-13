package TAREA6;

public class Persona {
    private String pelo;
    private String Ojos;
    private Double Edad;
    private String nombre;
    private String nacionalidad;
    private String genero;

    public Persona() {
        this.pelo = pelo;
    }

    public Persona(String pelo, String ojos, Double edad, String nombre, String nacionalidad, String genero) {
        this.pelo = pelo;
        Ojos = ojos;
        Edad = edad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    public String getPelo() {
        return pelo;
    }

    public String getOjos() {
        return Ojos;
    }

    public Double getEdad() {
        return Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void setOjos(String ojos) {
        Ojos = ojos;
    }

    public void setEdad(Double edad) {
        Edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "pelo='" + pelo + '\'' +
                ", Ojos='" + Ojos + '\'' +
                ", Edad=" + Edad +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    //metodo

    public void mostrarInfo(){

        System.out.println("¿De qué color es su pelo?" + getPelo());
        System.out.println("¿De qué color son tus ojos?" + getOjos());
        System.out.println("¿Qué edad tienes?" + getEdad());
        System.out.println("¿Cómo te llamas?" + getNombre());
        System.out.println("¿Qué nacionalidad tienes?" + getNacionalidad());
        System.out.println("¿Con qué genero te identificas?" + getNacionalidad());



    }

}
