package U2.Tarea8;
/*Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.*/
public class ejercicio11 {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println("Mostrar tablas: " + j + "x" + i + " = " + i * j);
      }
    }
  }
}
