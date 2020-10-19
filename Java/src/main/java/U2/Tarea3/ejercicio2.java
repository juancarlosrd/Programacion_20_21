package U2.Tarea3;

import java.util.Scanner;

// Crea un programa que pida al usuario su año de nacimiento y el año actual
// (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
// Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de
// -32.768 a 32.767.
public class ejercicio2 {
  public static void main(String[] args) {
    short fecha_nacimiento;
    short fecha_actual = 2020;
    int edad;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la fecha de nacimiento");
    fecha_nacimiento = sc.nextShort();
    edad = fecha_actual - fecha_nacimiento;
    System.out.println("La edad que tienes es: " + edad + " años ");
  }
}
