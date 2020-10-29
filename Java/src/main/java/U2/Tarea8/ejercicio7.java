package U2.Tarea8;
/*Diseñar un programa que muestre el producto de los 10 primeros números impares.*/
public class ejercicio7 {
  public static void main(String[] args) {

    for (int impar = 1; impar <= 10; impar += 2) {
      System.out.println("Mostrar el producto " + impar + " x " + impar + " = " + impar * impar);
    }
  }
}
