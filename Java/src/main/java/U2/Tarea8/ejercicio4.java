package U2.Tarea8;

import java.util.Scanner;

/* Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.*/
public class ejercicio4 {
  public static void main(String[] args) {
    int num_final;

    Scanner sc = new Scanner(System.in);
    System.out.println("Escribir un número n: ");
    num_final = sc.nextInt();

    for (int i = 1; i <= num_final; i++) {
      System.out.println("Escribir " + i);
    }
  }
}
