package U2.Tarea6;

import java.util.Scanner;

/*Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1
si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".
*/
public class ejercicio3 {
  public static void main(String[] args) {
    int par = 1;
    int impar = 0;

    System.out.println("Dame un número entero: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("El número es par , valor " + par);
    } else {
      System.out.println("El número no es par, valor " + impar);
    }
  }
}
