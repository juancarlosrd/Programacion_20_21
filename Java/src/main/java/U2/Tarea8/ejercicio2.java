package U2.Tarea8;

import java.util.Scanner;

/*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de
las edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.*/
public class ejercicio2 {
  public static void main(String[] args) {
    int edades;
    int suma_edades = 0;
    double media;
    int contador = 0;
    int mayor_de_edad = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las edades de los alumnos: ");
    edades = sc.nextInt();

    while (edades >= 0) {

      if (edades >= 18) {
        System.out.println("Es mayor de edad:  " + edades);
        mayor_de_edad = mayor_de_edad + 1;
      } else {
        System.out.println("No es mayor de edad: " + edades);
      }
      contador = contador + 1;
      suma_edades += edades;
      media = (float) suma_edades / contador;
      System.out.println("La suma de edades es:" + suma_edades);
      System.out.println("La media de edades introducida: " + media);
      System.out.println("Cantidad de alumnos que hemos introducido su edad: " + contador);
      System.out.println("Alumnos mayores de edad hasta ahora: " + mayor_de_edad);
      System.out.println("Otra de edad de alumnos: ");
      edades = sc.nextInt();
    }
    System.out.println("Se acaba por meter un numero negativo.");
  }
}
