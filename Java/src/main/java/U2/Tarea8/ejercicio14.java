package U2.Tarea8;

import java.util.Scanner;

/*Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*).
 Por ejemplo, para n=4:
* * * *
* * *
* *
*      */
public class ejercicio14 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un número n: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
