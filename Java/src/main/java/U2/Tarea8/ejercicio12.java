package U2.Tarea8;

import java.util.Scanner;

/*Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
 */
public class ejercicio12 {
  public static void main(String[] args) {
    int nota1, nota2, nota3, nota4, nota5;
    boolean no_aprobado = false;

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la nota de los alumnos: ");
    nota1 = sc.nextInt();
    if (nota1 >= 5) {
      no_aprobado = true;
      System.out.println("Aprobado");
    } else {
      System.out.println("Suspenso");
    }
    nota2 = sc.nextInt();
    if (nota2 >= 5) {
      no_aprobado = true;
      System.out.println("Aprobado");
    } else {
      System.out.println("Suspenso");
    }
    nota3 = sc.nextInt();
    if (nota3 >= 5) {
      no_aprobado = true;
      System.out.println("Aprobado");
    } else {
      System.out.println("Suspenso");
    }
    nota4 = sc.nextInt();
    if (nota4 >= 5) {
      no_aprobado = true;
      System.out.println("Aprobado");
    } else {
      System.out.println("Suspenso");
    }
    nota5 = sc.nextInt();
    if (nota5 >= 5) {
      no_aprobado = true;
      System.out.println("Aprobado");
    } else {
      System.out.println("Suspenso");
    }

    if (no_aprobado) {
      System.out.println("Hay algunos no aprobados.");
    } else {
      System.out.println("No hay alumnos suspensos");
    }
  }
}
