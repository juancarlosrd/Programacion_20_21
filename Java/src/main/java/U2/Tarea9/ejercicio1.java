package U2.Tarea9;

import java.util.Scanner;

/*Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.*/
public class ejercicio1 {
  public static void main(String[] args) {
    String palabra1;
    String palabra2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe dos palabras:");
    palabra1 = sc.nextLine();
    palabra2 = sc.nextLine();

    if (palabra1.compareTo(palabra2) == 0) {
      System.out.println("Son iguales de tamaño.");
    } else if (palabra1.compareTo(palabra2) > 0) {
      System.out.println("La palabra1 es mas grande que palabra2.");
    } else if (palabra1.compareTo(palabra2) < 0) {
      System.out.println("La palabra2 es mas grande que palabra1.");
    }
  }
}
