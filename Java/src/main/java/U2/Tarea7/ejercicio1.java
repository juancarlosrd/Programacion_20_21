package U2.Tarea7;
/* Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.*/
public class ejercicio1 {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a " + a);
    System.out.println("b " + b);
  }
}
