package Entregable_20_21_U2;

import java.util.Scanner;

/*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.
Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares.*/
public class ejercicio2 {
  public static void main(String[] args) {
    long numero;
    long par = 0;
    long impar = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, introduzca un número positivo: ");
    numero = sc.nextLong();

    for (int i = 1; i <= numero; i++) {
      if (numero % 2 != 0) {
        impar++;

      } else {
        par++;
      }
      numero = numero / 10;
    }
    System.out.println("Contiene " + par + " digitos pares y " + impar + " digitos impares");
  }
}
