package U2.Tarea6;

import java.util.Scanner;

/*Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional"
 */
public class ejercicio4 {
  public static void main(String[] args) {
    byte num1 = 0;
    byte num2 = 0;
    byte menor;
    menor = num1;
    menor = num2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce dos números de tipo byte");
    num1 = sc.nextByte();
    num2 = sc.nextByte();

    if (num1 > num2) {
      System.out.println("El numero  de menor valor es: " + num2);
    } else if (num2 > num1) {
      System.out.println("El numero de menor valor es: " + num1);
    }
  }
}
