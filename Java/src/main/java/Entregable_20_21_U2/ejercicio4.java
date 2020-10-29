package Entregable_20_21_U2;

import java.util.Scanner;

/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido (incluyendo él mismo). Al lado de cada número se debe indicar
si se trata de un primo o no.

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo*/
public class ejercicio4 {
  public static void main(String[] args) {
    int numero;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entero positivo: ");
    numero = sc.nextInt();
    int contador = 0;

    for (int i = numero; i < numero + 5; i++) {
      for (int columnas = 0; columnas <= 2; columnas++) {
        if (columnas == 0) {
          System.out.println(i);

        } else if (columnas == 1) {

          for (int o = 1; o <= i; o++) {
            if (i % o == 0) {
              contador++;
            }
          }
          if (contador == 2) {
            System.out.println("Es primo");
          } else {
            System.out.print("No es Primo");
          }
          contador = 0;
        }
      }
      System.out.println();
    }
  }
}
