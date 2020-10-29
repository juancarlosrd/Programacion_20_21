package U2.Tarea8;

import java.util.Scanner;

/*Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
A continuación, solicitará por teclado un valor que debe estar dentro del rango.
Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.*/
public class ejercicio5 {
  public static void main(String[] args) {
    int rango_max;
    int rango_min;
    int dentro_rango = 0;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Valores minimos y maximos de un rango: ");
      rango_max = sc.nextInt();
      rango_min = sc.nextInt();

      System.out.println("Introduzca un valor dentro del rango: ");
      dentro_rango = sc.nextInt();
      if (dentro_rango > rango_max && dentro_rango < rango_min) {
        System.out.println("Si está dentro del rango el número elegido:" + dentro_rango);
      } else {
        System.out.println("No está dentro del rango el número elegido:" + dentro_rango);
      }

    } while (dentro_rango <= rango_max || rango_min <= dentro_rango);
  }
}
