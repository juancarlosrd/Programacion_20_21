package U2.Tarea2;

import java.util.Scanner;

// Crea un programa que calcule y muestre la división de dos números enteros introducidos por el
// usuario.
public class ejercicio3 {
  public static void main(String[] args) {
    int num1;
    int num2;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el primer numero: ");
    num1 = sc.nextInt();
    System.out.print("Introduce el segundo numero: ");
    num2 = sc.nextInt();
    System.out.println("El resultado es : " + num1 / num2);
  }
}
