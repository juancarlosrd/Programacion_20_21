package U2.Tarea8b;

import java.util.Scanner;

/*Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.*/
public class ejercicio7 {
  public static void main(String[] args) {
    int numero;
    int resto;
    int al_reves = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    numero = sc.nextInt();

    while (numero != 0) {
      resto = numero % 10;
      al_reves = al_reves * 10 + resto;
      numero /= 10;
    }
    System.out.println("El resultado es: " + al_reves);
  }
}
