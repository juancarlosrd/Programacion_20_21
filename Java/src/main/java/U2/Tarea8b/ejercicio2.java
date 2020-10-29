package U2.Tarea8b;

import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas, el cuadrado y
el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
public class ejercicio2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int num = sc.nextInt();

    for (int i = num + 1; i < num + 6; i++) {
      System.out.println("| " + i + " | " + (i * i) + " | " + (long) Math.pow(i, 3) + " | ");
    }
  }
}
