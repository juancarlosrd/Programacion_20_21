package U2.Tarea6;

import java.util.Scanner;

/*Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1
si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".*/
public class ejercicio3_2 {
  public static void main(String[] args) {
    int par = 1;
    int impar = 0;

    System.out.println("Dame un número entero: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();

    par = numero % 2 == 0 ? 1 : 0;

    System.out.print("El valor es de .... " + par);
  }
}
