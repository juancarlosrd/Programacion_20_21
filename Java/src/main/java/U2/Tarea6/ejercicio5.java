package U2.Tarea6;

import java.util.Scanner;

/*Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
y a continuación muestre un pequeño menú con 3 opciones:
1.Calcular diámetro
2.Calcular perímetro
3.Calcular área
Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
(diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio).*/
public class ejercicio5 {
  public static void main(String[] args) {
    final double PI = 3.14;
    float radio;
    float perimetro;
    float diametro;
    int opcion;

    Scanner sc = new Scanner(System.in);
    System.out.println("¿Que quieres calcular ?");
    System.out.println("1.Calcular diametro: ");
    System.out.println("2.Calcular perimetro: ");
    System.out.println("3.Calcular área: ");
    opcion = sc.nextInt();
    System.out.println("introcude el valor del radio:");
    radio = sc.nextFloat();

    switch ((int) opcion) {
      case 1:
        System.out.println("Calcular diámetro:" + 2 * radio);
        break;
      case 2:
        System.out.println("Calcular perímetro: " + 2 * PI * radio);
        break;
      case 3:
        System.out.println("Calcular área: " + PI * radio * radio);
        break;
      default:
        System.out.println("No hay nada que calcular.");
    }
  }
}
