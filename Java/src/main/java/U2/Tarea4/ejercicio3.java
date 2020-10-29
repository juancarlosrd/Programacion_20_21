package U2.Tarea4;

import java.util.Scanner;

/*Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.*/
public class ejercicio3 {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double nota3;
    double resultado;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las tres notas: ");
    nota1 = sc.nextDouble();
    nota2 = sc.nextDouble();
    nota3 = sc.nextDouble();

    resultado = (int) ((nota1 + nota2 + nota3) / 3.0);
    System.out.println("La media es: " + resultado);
  }
}
