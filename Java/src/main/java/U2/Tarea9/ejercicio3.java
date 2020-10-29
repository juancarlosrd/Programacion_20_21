package U2.Tarea9;

import java.util.Scanner;

/*En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.*/
public class ejercicio3 {
  public static void main(String[] args) {
    String contrasenia1;
    String contrasenia2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Contraseña del usuario 1: ");
    contrasenia1 = sc.nextLine();
    System.out.println("Contraseña del usuario 2: ");
    contrasenia2 = sc.nextLine();

    while (contrasenia1 != contrasenia2) {
      if (contrasenia1.compareTo(contrasenia2) == 0) {
        System.out.println("Acertaste la contraseña. ");
        System.out.println(
            "Mostrar el resultado de las contraseñas:" + contrasenia1 + " , " + contrasenia2);
        break;
      } else if (contrasenia1.compareTo(contrasenia2) > 0) {
        System.out.println("La contraseña 1 es más grande, vuelve a intentarlo usuario 2:  ");
        contrasenia2 = sc.nextLine();
        continue;
      } else if (contrasenia1.compareTo(contrasenia2) < 0) {
        System.out.println("La contraseña 2 es más grande,  vuelve a intentarlo  usuario 2: ");
        contrasenia2 = sc.nextLine();
      }
    }
    System.out.println("Hasta luego.");
  }
}
