package U2.Tarea4;
/*El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
Es decir, que muestre el valor máximo de una variable de tipo short, y muestre también qué ocurre si sumamos 1 a esa variable.
 */
public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Rango máximo:" + Short.MAX_VALUE + 1);

    System.out.println("Rango mínimo:" + Short.MIN_VALUE + 1);
  }
}
