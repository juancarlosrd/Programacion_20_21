package U2.Tarea9;

import java.util.Scanner;

/*Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar
otra intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
El programa debe escribir "Acertaste" o "Fallaste".
 */
public class ejercicio2 {
  public static void main(String[] args) {
    String contrasenia1;
    String contrasenia2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Jugador 1, introduce la contraseña: ");
    contrasenia1 = sc.nextLine();
    System.out.println("Jugador 2, introduce la contraseña:");
    contrasenia2 = sc.nextLine();

    while (contrasenia1 != contrasenia2) {
      if (contrasenia1.compareTo(contrasenia2) == 0) {
        System.out.println("Acertaste la contraseña.");
        System.out.println("Mostrar resultado: " + contrasenia1 + " = " + contrasenia2);
        break;
      } else {
        System.out.println("No acertaste la contraseña, vuelve a intentarlos.");
        System.out.print("Las pistas son: " + contrasenia1.length() + " caracteres, ");
        System.out.print(" y empieza por la letra " + contrasenia1.charAt(0));
        System.out.println(" y acaba por la letra " + contrasenia1.charAt(1 - 1));
        contrasenia2 = sc.nextLine();
      }
    }
    System.out.println("Hasta la proxima. ");
  }
}
