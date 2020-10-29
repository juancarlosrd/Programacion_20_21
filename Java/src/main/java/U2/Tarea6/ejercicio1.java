package U2.Tarea6;
/*: Crea un programa que pida al usuario el número de un mes
y escriba el nombre de ese mes. Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".*/

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int mes;
    System.out.println("Introduce el número de mes");
    Scanner sc = new Scanner(System.in);
    mes = sc.nextInt();

    switch (mes) {
      case 1:
        System.out.println("enero");
        break;
      case 2:
        System.out.println("febreo");
        break;
      case 3:
        System.out.println("marzo");
        break;
      case 4:
        System.out.println("abril");
        break;
      case 5:
        System.out.println("mayo");
        break;
      case 6:
        System.out.println("junio");
        break;
      case 7:
        System.out.println("julio");
        break;
      case 8:
        System.out.println("agosto");
        break;
      case 9:
        System.out.println("septiembre");
        break;
      case 10:
        System.out.println("octubre");
        break;
      case 11:
        System.out.println("noviembre");
      case 12:
        System.out.println("diciembre");
      default:
        System.out.println("No existe el mes");
    }
  }
}
