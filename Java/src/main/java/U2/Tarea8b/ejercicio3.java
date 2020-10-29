package U2.Tarea8b;

import java.util.Scanner;

/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
El número n se debe introducir por teclado.*/
public class ejercicio3 {
  public static void main(String[] args) {
    int n;

    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Introduce un número n: ");
      n = sc.nextInt();
    } while (n <= 2);
    int num1 = 0;
    int num2 = 1;
    int fibonacci = 0;
    System.out.println(
        "Las primeras " + n + " de la serie de Fibonacci son: " + num1 + " " + num2 + " ");
    for (int i = 0; i < (n - 2); i++) {
      fibonacci = num1 + num2;
      System.out.print(" " + fibonacci + " ");
      num1 = num2;
      num2 = fibonacci;
    }
  }
}
