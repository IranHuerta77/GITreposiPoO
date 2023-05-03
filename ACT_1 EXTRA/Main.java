import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hgd");
        Scanner scanner = new Scanner(System.in);


        try {
            int a = 10;
            int b = scanner.nextInt();
            System.out.println("División: " + (a / b));
        } catch(ArithmeticException e ) {
            System.out.println("no se puede dividir entre 0");
        }catch (NumberFormatException nfe){
            System.out.println("No se puede capturar el dato completo");
        } finally {
            System.out.println("siempre se ejecuta...");
        }


        System.out.println("Fin del programa!!");


    }
}
