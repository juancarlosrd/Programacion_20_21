package U2.Tarea8b;

import java.util.Scanner;

/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
El carácter con el que se pinta la pirámide también se debe pedir por teclado.*/
public class ejercicio5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la piramide: ");
    int altura = sc.nextInt();
    sc.nextLine();

    System.out.print("Introduce el caracter: ");
    String relleno = sc.nextLine();

    int espacio_delante = altura - 1;
    int espacio_interno = 0;

    int filas = 1;
    for (filas = 1; filas < altura; filas++) {
      for (int i = 1; i <= espacio_delante; i++) {
        System.out.print(" ");
      }

      System.out.print(relleno);
      for (int i = 1; i < espacio_interno; i++) {
        System.out.print(" ");
      }
      if (filas > 1) {
        System.out.print(relleno);
      }

      espacio_delante--;
      espacio_interno += 2;
      System.out.println();
    }
    for (int i = 1; i < filas * 2; i++) {
      System.out.print(relleno);
    }
  }
}
