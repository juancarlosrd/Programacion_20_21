package U2.Tarea8b;

import java.util.Scanner;

/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje Lo siento, esa no es la combinación y si
acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente. Tendremos cuatro oportunidades para abrir la
caja fuerte.
 */
public class ejercicio1 {
  public static void main(String[] args) {
    int combinacion;
    int contador = 3;
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Initroduce la combinación de la caja fuerte, tienes 4 intentos para acertarla.: ");
    combinacion = sc.nextInt();

    for (int i = 0; i <= 2; i++) {

      if (combinacion != 1234) {
        System.out.println("No has acertado la combinación, vuelve a intentarlo. ");
        System.out.println("Te quedan " + contador-- + " intentos.");
        combinacion = sc.nextInt();

      } else if (combinacion == 1234) {
        System.out.println("Has acertado la combinación de la caja fuerte. Hasta luego.");
        break;
      }
    }
  }
}
