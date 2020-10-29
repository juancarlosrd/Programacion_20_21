package U2.Tarea5;

import java.util.Scanner;

/* Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
o si, por el contrario, no lo es (usando "else").*/
public class ejercicio1 {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número entero: ");
    num = sc.nextInt();
    if (num > 0) {
      System.out.println("El numero es positivo y es mayor que cero");
    } else {
      System.out.println("No lo es");
    }
  }
}
