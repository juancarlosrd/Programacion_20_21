package U2.Tarea7;

import java.util.Scanner;

/*Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:
verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
falso. En caso contrario escribe el código necesario para inicializar "jasp" en una línea.*/
public class ejercicio2 {
  public static void main(String[] args) {
    int edad = 0;
    int nivel_estudios = 0;
    int ingresos = 0;
    boolean jasp;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce los datos: ");
    edad = sc.nextInt();
    nivel_estudios = sc.nextInt();
    ingresos = sc.nextInt();

    if (edad <= 28 && nivel_estudios > 3 && ingresos > 28000) {
      jasp = true;
    } else {
      jasp = false;
    }
    System.out.println("Es: " + jasp);
  }
}
