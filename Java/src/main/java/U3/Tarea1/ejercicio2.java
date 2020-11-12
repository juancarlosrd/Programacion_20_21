package U3.Tarea1;

import java.util.Scanner;

/* Diseñar una  función a la que se le pasen dos enteros y muestre
todos los números comprendidos entre ellos.
*/
public class ejercicio2 {
  public static void main(String[] args) {
    int entero1;
    int entero2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce dos enteros: ");
    entero1 = sc.nextInt();
    entero2 = sc.nextInt();

    dos_entero(entero1);
    dos_entero(entero2);
  }

  static void dos_entero(int entero2) {
    for (int i = 0; i <= 1; i++) {
      System.out.println("Mostrar " + entero2);
    }
  }
}
