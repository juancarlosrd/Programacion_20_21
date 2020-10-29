package U2.Tarea9;

import java.util.Scanner;

/* Diseñar un programa que pida una frase al usuario,
e indique si el carácter de la posición central es o no un espacio.*/
public class ejercicio4 {
  public static void main(String[] args) {
    String frase;
    int espacio = 0;
    char c;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una frase: ");
    frase = sc.nextLine();

    for (int i = 0; i < frase.length(); i++) {
      c = frase.charAt(i);
      if (Character.isSpaceChar(c)) {
        espacio++;
      }
    }
    System.out.println("Espacios en total: " + espacio + " espacio");
  }
}
