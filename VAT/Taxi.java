package VAT;

public class Taxi extends Vehiculo {
    private String Legal;
    private String Bonito;
    private String Electrico;

    public Taxi() {
    }

    public Taxi(String legal, String bonito, String electrico) {
        Legal = legal;
        Bonito = bonito;
        Electrico = electrico;
    }

    public String getLegal() {
        return Legal;
    }

    public void setLegal(String legal) {
        Legal = legal;
    }

    public String getBonito() {
        return Bonito;
    }

    public void setBonito(String bonito) {
        Bonito = bonito;
    }

    public String getElectrico() {
        return Electrico;
    }

    public void setElectrico(String electrico) {
        Electrico = electrico;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Legal='" + Legal + '\'' +
                ", Bonito='" + Bonito + '\'' +
                ", Electrico='" + Electrico + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Toneladas='" + Toneladas + '\'' +
                ", Transnmición='" + Transnmición + '\'' +
                '}';
    }

    public void Acelerar(){
        System.out.println("El taxi acelera");

    }

    public void Servicio(){
        System.out.println("El taxi sí da servicio");

    }

    public void Manipulado(){
        System.out.println("El taxi sí está manipulado");

    }

    @Override
    public void Enciende() {
        System.out.println("el vehiculo sí es " + Bonito + "y funciona bien");

    }
}
