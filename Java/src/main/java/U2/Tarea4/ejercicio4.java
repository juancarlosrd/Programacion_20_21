package U2.Tarea4;

import java.util.Scanner;

/*Sería interesante disponer de un programa que pida como entrada un número
decimal y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
 */
public class ejercicio4 {
  public static void main(String[] args) {
    double numero;

    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un número decimal y lo redondearé: ");
    numero = sc.nextDouble();
    System.out.println("El redondeo es : " + Math.round(numero));
  }
}
