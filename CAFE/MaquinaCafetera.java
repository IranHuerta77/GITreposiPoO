import java.util.Scanner;

public class MaquinaCafetera {
    private int agua;
    private int cafe;
    private int crema;
    int vasos;

    public MaquinaCafetera() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public void servirAmericano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            System.out.println("Se sirvió un café Americano");
        } else {
            System.out.println("No se pudo servir el café Americano");
        }
    }

    public void servirExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            System.out.println("Se sirvió un café Expreso");
        } else {
            System.out.println("No se pudo servir el café Expreso");
        }
    }

    public void servirCapuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            System.out.println("Se sirvió un café Capuchino");
        } else {
            System.out.println("No se pudo servir el café Capuchino");
        }
    }

    public void mostrarEstado() {
        System.out.println("Cantidad de agua: " + this.agua + " ml");
        System.out.println("Cantidad de café: " + this.cafe + " g");
        System.out.println("Cantidad de crema: " + this.crema + " ml");
        System.out.println("Cantidad de vasos: " + this.vasos);
    }

}
