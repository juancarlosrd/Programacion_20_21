package U2.Tarea5;

import java.util.Scanner;

/*Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.*/
public class ejercicio5 {
  public static void main(String[] args) {
    long num1;
    long num2;
    long num3;

    System.out.println("Introduce tres números enteros largos: ");
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextLong();
    num2 = sc.nextLong();
    num3 = sc.nextLong();

    if (num1 > num2 && num1 > num3) {
      System.out.println("El mayor es el primer número introducido");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("El mayor es el segundo número introducido");
    } else {
      System.out.println("El mayor es el tercer numero introducido");
    }
  }
}
