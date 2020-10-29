package U2.Tarea8;

import java.util.Scanner;

/*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado.
El proceso terminará cuando el número introducido por teclado sea 0.*/
public class ejercicio1 {
  public static void main(String[] args) {
    int numero;
    boolean espar;
    boolean numero_positivo;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    numero = sc.nextInt();

    espar = numero % 2 == 0 ? true : false;
    numero_positivo = numero < 0 ? false : true;

    while (numero != 0) {

      System.out.println("El número es par:" + espar);
      System.out.println("El número es positivo: " + numero_positivo);
      System.out.println("El cuadrado del número: " + Math.pow(numero, 2));
      System.out.println("Otro numero: ");
      numero = sc.nextInt();
    }

    System.out.println("Se acaba.");
  }
}
