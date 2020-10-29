package U2.Tarea5;

import java.util.Scanner;

/*Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.*/
public class ejercicio4 {
  public static void main(String[] args) {
    int numero1;
    int numero2;

    System.out.println("Introduce dos números enteros: ");
    Scanner sc = new Scanner(System.in);
    numero1 = sc.nextInt();
    numero2 = sc.nextInt();

    if ((numero1 % 2 == 0 && numero2 % 2 != 0) || (numero1 % 2 != 0 && numero2 % 2 == 0)) {
      System.out.println("Solo uno es par.");
    } else if (numero1 % 2 != 0 && numero2 % 2 != 0) {
      System.out.println("Ninguno es par");
    } else {
      System.out.println("Son los dos pares");
    }
  }
}
