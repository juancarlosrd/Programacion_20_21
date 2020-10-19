package U2.Tarea2;

import java.util.Scanner;

// Crea un programa que pida al
// usuario una longitud en millas (por ejemplo, 3) y
// calcule su equivalencia en metros (1 milla = 1609 m).
public class ejercicio4 {

  public static void main(String[] args) {
    final int MILLA = 1609;
    int m;
    int resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un longitud:");
    m = sc.nextInt();
    resultado = m * MILLA;
    System.out.println("El resultado es: " + resultado);
  }
}
