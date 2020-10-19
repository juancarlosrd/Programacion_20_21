package U2.Tarea4;

import java.util.Scanner;

/*Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
Hay que tener en cuenta que la media puede contener decimales.
 */
public class ejercicio2 {
  public static void main(String[] args) {
    int nota1;
    int nota2;
    double resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las dos notas: ");
    nota1 = sc.nextInt();
    nota2 = sc.nextInt();

    resultado = (nota1 + nota2) / 2.0;
    System.out.println("La media es: " + resultado);
  }
}
