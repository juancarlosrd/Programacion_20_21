package U2.Tarea8b;

import java.util.Scanner;

/*Lo  que el 5 pero la pirámide hueca*/
public class ejercicio6 {
  public static void main(String[] args) {

    int altura = 1;
    int i;
    int alturaIntroducida = 0;
    int espacioPorDelante = alturaIntroducida - 1;
    int espacioInternos = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altura de la piramide: ");
    alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();

    while (altura < alturaIntroducida) {

      for (i = 1; i <= espacioPorDelante; i++) {
        System.out.println(" ");
      }

      System.out.println(relleno);
      for (i = 1; i <= espacioInternos; i++) {
        System.out.println(" ");
      }
      if (altura > 1) {
        System.out.println(relleno);
      }
      System.out.println();
      altura++;
      espacioPorDelante--;
      espacioInternos += 2;
    }

    for (i = 1; i < altura * 2; i++) {
      System.out.println(relleno);
    }
  }
}
