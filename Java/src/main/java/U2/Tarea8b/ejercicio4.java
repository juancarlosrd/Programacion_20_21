package U2.Tarea8b;

import java.util.Scanner;

/*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos*/
public class ejercicio4 {
  public static void main(String[] args) {
    int num;
    int positivo = 0;
    int negativo = 0;

    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.println("Introduce  numero:");
      num = sc.nextInt();

      if (num >= 0) {
        positivo++;
      } else {
        negativo++;
      }
    }
    System.out.println("Total de numeros positivos: " + positivo);
    System.out.println("Ttoal de numeros negativos: " + negativo);
  }
}
