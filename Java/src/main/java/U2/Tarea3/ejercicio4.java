package U2.Tarea3;

import java.util.Scanner;

/*Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
 sout */
public class ejercicio4 {
  public static void main(String[] args) {
    final float MILLA = (float) 1.609;
    float millas;
    float resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la longitud: ");
    millas = sc.nextInt();
    resultado = millas * MILLA;
    System.out.println("El resultado es: " + resultado + " km ");
  }
}
