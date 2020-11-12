package U3.Tarea1;

import java.util.Scanner;

/*Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces
el mensaje "Eco..."
 */
public class ejercicio1 {
  public static void main(String[] args) {
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número n: ");
    n = sc.nextInt();
    eco(n);
  }

  static void eco(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println("Eco...");
    }
  }
}
