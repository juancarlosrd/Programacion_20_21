package U2.Tarea2;

import java.util.Scanner;

// Crea un programa que pida al usuario una temperatura en grados
// centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
public class ejercicio5 {
  public static void main(String[] args) {
    int num;
    double resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una temperatura: ");
    num = sc.nextInt();
    resultado = 9.0 * num / 5 + 32;
    System.out.println("En Fahrenheit es: " + resultado);
  }
}
