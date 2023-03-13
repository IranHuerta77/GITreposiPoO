package TAREA6;

public class PIKUY {
    private double Edad;
    private  String Raza;
    private  double peso;
    private  String Ojos;
    private String tamaño;
    private int vidas;
    private String personalidad;

    public PIKUY() {
        Edad = Edad;
    }

    public PIKUY(double edad, String raza, double peso, String ojos, String tamaño, int vidas, String personalidad) {
        Edad = edad;
        Raza = raza;
        this.peso = peso;
        Ojos = ojos;
        this.tamaño = tamaño;
        this.vidas = vidas;
        this.personalidad = personalidad;
    }

    public double getEdad() {
        return Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public double getPeso() {
        return peso;
    }

    public String getOjos() {
        return Ojos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getVidas() {
        return vidas;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setEdad(double edad) {
        Edad = edad;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setOjos(String ojos) {
        Ojos = ojos;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    @Override
    public String toString() {
        return "PIKUY{" +
                "Edad=" + Edad +
                ", Raza='" + Raza + '\'' +
                ", peso=" + peso +
                ", Ojos='" + Ojos + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", vidas=" + vidas +
                ", personalidad='" + personalidad + '\'' +
                '}';
    }

    public void mostrarInfo(){

        System.out.println("¿Cuantos años tiene Pikuy" + getEdad());
        System.out.println("¿De qué raza es?" + getRaza());
        System.out.println("¿Cuánto pesa Pikuy?" + getPeso());
        System.out.println("¿De qué color son los ojos de Pikuy?" + getOjos());
        System.out.println("¿Cuál es le tamaño de pikuy?" + getTamaño());
        System.out.println("¿Cuántas vidas le quedan a pikuy?" + getVidas());
        System.out.println("¿Cómo es su personalidad?" + getPersonalidad());

    }

}
