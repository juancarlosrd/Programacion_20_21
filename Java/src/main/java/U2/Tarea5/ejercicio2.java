package U2.Tarea5;

import java.util.Scanner;

/*Crea un programa que pida al usuario que introduzca el número 12.
Después debe decirle si lo ha hecho correctamente o no.
*/
public class ejercicio2 {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero 12: ");
    num = sc.nextInt();

    if (num == 12) {
      System.out.println("Lo has hecho correctamente ");
    } else {
      System.out.println("No es el 12");
    }
  }
}
