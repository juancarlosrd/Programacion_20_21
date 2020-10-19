package U2.Tarea3;

import java.util.Scanner;

// Crea un programa que calcule y muestre la suma de dos números de dos
// cifras (de tipo byte) que introduzca el usuario.
public class ejercicio1 {
  public static void main(String[] args) {
    byte num1;
    byte num2;
    int resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introuce dos numeros:");
    num1 = sc.nextByte();
    num2 = sc.nextByte();
    resultado = num1 + num2;
    System.out.println("El resultado de la suma es: " + resultado);
  }
}
