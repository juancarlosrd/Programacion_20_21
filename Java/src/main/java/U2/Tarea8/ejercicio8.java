package U2.Tarea8;

import java.util.Scanner;

/*Pedir un número y calcular su factorial.
Ejemplo: Factorial de 5:
5! = 5x4x3x2x1 = 120*/
public class ejercicio8 {
  public static void main(String[] args) {

    double factorial;
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número a calculo su factorial:");
    numero = sc.nextInt();

    factorial = 1;
    for (int i = numero; i > 0; i--) {
      factorial = factorial * i;
    }
    System.out.println("El factorial de: " + numero + "!" + " = " + factorial);
  }
}
