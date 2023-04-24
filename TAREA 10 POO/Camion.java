public class Camion implements INTERFAZauto{
    private String combustible;
    private double peso;

    public Camion() {
    }

    public Camion(String combustible, double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void transportar(){
        System.out.println("transportando algo");
    }


    @Override
    public boolean encender() {
        System.out.println("encendiendo el camión de combustible" + this.combustible);
        return Math.random() >=0.2 ;
    }

    @Override
    public boolean apagar() {
        System.out.println("apagando el camión de combustible" + this.combustible);
        return Math.random() >=0.05 ;

    }

    @Override
    public void avanzar() {
        System.out.println("el camión está avanzando");

    }

    @Override
    public void frenar() {
        System.out.println("frenando");

    }
}
