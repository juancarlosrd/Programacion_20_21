package U2_entrega;

import java.util.Scanner;

/*Escribe un programa que lea un número n e imprima una pirámide de letras
con n filas como en la siguiente figura:

     abcdcba
      abcba
       aba
        a */
public class ejercicio1 {
  public static void main(String[] args) {
    int altura;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número n: ");
    altura = sc.nextInt();

    int espacio_delante = altura + 0;

    int filas = 0;
    for (filas = 0; filas <= altura; filas++) {
      for (int i = 1; i <= espacio_delante; i++) {
        System.out.print("abcd");
      }

      espacio_delante--;

      System.out.println();
    }
  }
}
