package U2.Tarea5;

import java.util.Scanner;

/*Crea un programa que diga si el número introducido por el usuario es impar o no lo es.*/
public class ejercicio3 {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println("El número es par");
    } else {
      System.out.println("El número es impar");
    }
  }
}
