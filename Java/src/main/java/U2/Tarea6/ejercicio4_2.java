package U2.Tarea6;

import java.util.Scanner;

public class ejercicio4_2 {
  public static void main(String[] args) {
    byte num1 = 0;
    byte num2 = 0;
    byte menor;
    menor = num1;
    menor = num2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Dame dos números de tipo byte: ");
    num1 = sc.nextByte();
    num2 = sc.nextByte();

    menor = num1 > num2 ? num2 : num1;
    menor = num2 > num1 ? num1 : num2;

    System.out.println("El de menor valor es: " + menor);
  }
}
