package U2.Tarea8;

import java.util.Scanner;

/* Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando
de acertarlo. El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido
por el usuario. El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1.)
*/
public class ejercicio3 {
  public static void main(String[] args) {
    int num_aleatorio;
    int numero;

    num_aleatorio = (int) (Math.random() * 100 + 1);
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Introduce un numero a ver si lo acierto y no introduzcas un -1 porque se acaba:");
    numero = sc.nextInt();

    while (numero != -1 && numero != num_aleatorio) {
      if (numero > num_aleatorio) {
        System.out.println("El numero que has introducido es mayor.");
      } else {
        System.out.println("El numero que has introduciso es menor.");
      }
      System.out.println("El numero es: " + num_aleatorio);
      System.out.println("Introduce otro número hasta que lo aciertes:");
      numero = sc.nextInt();
    }
    if (numero == num_aleatorio) {
      System.out.println("Has acertado el numero aleatorio.");
    } else {
      System.out.println("Se ha terminado por introducir un -1.");
    }
  }
}
