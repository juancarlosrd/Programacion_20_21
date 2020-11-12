package U2.Tarea8b;

import java.util.Scanner;

/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
public class ejercicio11 {
  public static void main(String[] args) {
    int altura = 0;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Iintroduce un numero impar igual o mayor que 3");
      altura = sc.nextInt();
      if (altura % 2 == 0 || altura <= 3) {
        System.out.println("No, son los datos correctos.");
      }
    } while (altura % 2 == 0 || altura <= 3);

    for (int filas = 1; filas <= altura; filas++) {
      for (int columnas = 1; columnas <= altura; columnas++) {
        if (filas == columnas || filas == altura - columnas + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println("");
    }
  }
}
