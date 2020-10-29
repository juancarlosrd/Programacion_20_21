package U2.Tarea6;

import java.util.Scanner;

// Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
// Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
public class ejercicio2 {
  public static void main(String[] args) {
    int numero;
    System.out.println("Escribe un número:");
    Scanner sc = new Scanner(System.in);
    numero = sc.nextInt();

    switch (numero) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;
      case 5:
        System.out.println("5");
        break;
      case 6:
        System.out.println("6");
        break;
      case 7:
        System.out.println("7");
        break;
      case 8:
        System.out.println("8");
        break;
      case 9:
        System.out.println("9");
        break;
      case 10:
        System.out.println("10");
        break;
      default:
        System.out.println("No está el número");
    }
  }
}
