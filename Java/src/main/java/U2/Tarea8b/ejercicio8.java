package U2.Tarea8b;

import java.util.Scanner;

/*Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de lunes a domingo).
Se debe comprobar que el usuario introduce los datos correctamente y que
el segundo día es posterior al primero.
 */
public class ejercicio8 {
  public static void main(String[] args) {
    int hora_inicio;
    int dia_inicio;
    int hora_fin;
    int dia_fin;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la primera hora: ");
    hora_inicio = sc.nextInt();
    sc.nextLine();
    System.out.println("Introduce el dia de la primera hora (1 al 7): ");
    dia_inicio = sc.nextInt();
    sc.nextLine();

    System.out.println("Introduce la segunda hora: ");
    hora_fin = sc.nextInt();
    sc.nextLine();
    System.out.println("Introduce el dia de la segunda hora (1 al 7): ");
    dia_fin = sc.nextInt();
    sc.nextLine();

    if (hora_inicio < 0 || hora_inicio > 25) {
      System.out.println("Has introducido mal la hora de inicio");
    }
    if (hora_fin < 0 || hora_fin > 25) {
      System.out.println("Has introducido mal la hora de fin");
    }
    if (dia_inicio < 0 || dia_inicio > 7) {
      System.out.println("Has introducido mal el dia de inicio");
    }
    if (dia_fin < 0 || dia_fin > 7) {
      System.out.println("Has introducido mal el dia de fin");
    }

    if (dia_inicio > dia_fin) {
      System.out.println("El dia de fin no  puede ser anterior al dia de fin");
    } else if (dia_inicio == dia_fin && hora_inicio > hora_fin) {
      System.out.println(
          "El dia de inicio y de fin son el mismo, pero la hora de fin es anterior a la de inicio.");
    } else {
      int suma_horas = (dia_fin - dia_inicio) * 24 + (hora_fin - hora_inicio);
      System.out.println("El numero de horas transcurridas es: " + suma_horas);
    }
  }
}
