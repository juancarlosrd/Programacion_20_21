package U2.Tarea5;

import java.util.Scanner;

/*Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo",
y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
 Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"*/
public class ejercicio6 {
  public static void main(String[] args) {
    final double GRAVEDAD = 9.8;
    double tiempo;
    double velocidad;

    System.out.println("Introduce el valor del tiempo: ");
    Scanner sc = new Scanner(System.in);
    tiempo = sc.nextDouble();
    if (tiempo <= 0) {
      System.out.println("Tiempo incorrecto");
    } else {
      velocidad = GRAVEDAD * tiempo;
      System.out.println("La velocidad es de: " + velocidad);
    }
  }
}
