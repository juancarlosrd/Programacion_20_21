package U2.Tarea8;

import java.util.Scanner;

/* Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así,
volver a pedirlo hasta que lo cumpla.*/
public class ejercicio10 {
  public static void main(String[] args) {
    int numero;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número entre el 1 y el 10: ");
    numero = sc.nextInt();

    do {
      if (numero >= 1 && numero <= 10) {
        for (int i = 0; i <= 10; i++) {
          System.out.println(numero + " x " + i + " = " + numero * i);
        }
      } else {
        System.out.println("Volver a introducir el número y tiene que estar entre el 1 y el 10: ");
        numero = sc.nextInt();
        if (numero >= 1 && numero <= 10) {
          for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
          }
        }
      }
    } while (!(numero >= 1 && numero <= 10));
  }
}
