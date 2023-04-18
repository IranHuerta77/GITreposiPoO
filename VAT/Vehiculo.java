package VAT;

public class Vehiculo {
    protected String Tipo;
    protected String Toneladas;
    protected String Transnmición;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String toneladas, String transnmición) {
        Tipo = tipo;
        Toneladas = toneladas;
        Transnmición = transnmición;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getToneladas() {
        return Toneladas;
    }

    public void setToneladas(String toneladas) {
        Toneladas = toneladas;
    }

    public String getTransnmición() {
        return Transnmición;
    }

    public void setTransnmición(String transnmición) {
        Transnmición = transnmición;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo='" + Tipo + '\'' +
                ", Toneladas='" + Toneladas + '\'' +
                ", Transnmición='" + Transnmición + '\'' +
                '}';
    }

    public void Funciona(){
        System.out.println("El Vehiculo funciona");

    }
    public void Enciende(){
        System.out.println("El Vehiculo enciende");

    }
}
