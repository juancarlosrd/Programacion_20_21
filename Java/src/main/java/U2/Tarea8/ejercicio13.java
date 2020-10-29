package U2.Tarea8;

import java.util.Scanner;

/* Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.*/
public class ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int aprobados = 0;
    int suspensos = 0;

    for (int i = 1; i <= 6; i++) {
      System.out.println("Introducir las notas de los alumnos: ");
      double notas = sc.nextDouble();

      if (notas >= 5) {
        aprobados++;
        System.out.println("Aprobados");
      } else if (notas == 4) {
        contador++;
        System.out.println("Condicionados");
      } else if (notas < 4) {
        suspensos++;
        System.out.println("Suspensos");
      }
    }
    System.out.println("Aprobados cantidad:" + aprobados);
    System.out.println("Condicionado cantidad: " + contador);
    System.out.println("Suspensos cantidad: " + suspensos);
  }
}
