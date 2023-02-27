import java.util.Scanner;

public class gato {

   public static void main(String[] args) {
      // Creamos una matriz para representar el tablero de 3x3
      char[][] tablero = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
      
         // Imprimimos el tablero actual
         System.out.println("");
         System.out.println("-----");
         System.out.println("|" + tablero[0][0] + "" + tablero[0][1] + "" + tablero[0][2] + "|");
         System.out.println("");
         System.out.println("|" + tablero[1][0] + "" + tablero[1][1] + "" + tablero[1][2] + "|");
         System.out.println("");
         System.out.println("|" + tablero[2][0] + "" + tablero[2][1] + "" + tablero[2][2] + "|");
         System.out.println("-----");
   }
}