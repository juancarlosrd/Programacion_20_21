package U2.Tarea3;

import java.util.Scanner;

// Crea un programa que calcule y muestre la división de dos números reales de doble precisión
// introducidos por el usuario.
public class ejercicio3 {
  public static void main(String[] args) {
    float num1;
    float num2;
    float resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Dame los numeros: ");
    num1 = sc.nextFloat();
    num2 = sc.nextFloat();

    resultado = num1 / num2;
    System.out.println("El resultado es: " + resultado);
  }
}
