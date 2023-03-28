import java.util.Scanner;

public class PMaquinaCafe{

    public static void main(String[] args) {
        MaquinaCafetera maquina = new MaquinaCafetera();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando la máquina de café");
        while (true) {
            System.out.println("Escoja su café: 1) Americano, 2) Expreso, 3) Capuchino");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    maquina.servirAmericano();
                    break;
                case 2:
                    maquina.servirExpreso();
                    break;
                case 3:
                    maquina.servirCapuchino();
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
            maquina.mostrarEstado();
            if (maquina.vasos == 0) {
                System.out.println("Se acabaron los vasos, por lo tanto la máquina se ha detenido :(");
                maquina.mostrarEstado();
                break;
            }
        }
    }
}    