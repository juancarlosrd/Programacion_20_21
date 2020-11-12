package U2_entrega;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    long numero;
    int impar = 0;
    int par = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor introduzca un número entero positivo: ");
    numero = sc.nextLong();

    for (int i = 1; i <= numero; i++) {
      if (numero % 2 == 0) {
        par++;
      } else {
        impar++;
      }
      numero = numero / 10;
    }
    System.out.println("Digitos pares  " + par + " digitos impares " + impar);
  }
}
