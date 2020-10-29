package U2.Tarea8;
/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.*/

import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    int etiqueta_arbol_mas_alto;
    int altura_arbol_mas_alto;
    int etiqueta = 0;
    int altura;

    Scanner sc = new Scanner(System.in);
    System.out.println("Altura del arbol: ( " + etiqueta + " ):");
    altura = sc.nextInt();
    altura_arbol_mas_alto = altura;
    etiqueta_arbol_mas_alto = 0;

    while (altura != -1) {
      if (altura > altura_arbol_mas_alto) {
        altura_arbol_mas_alto = altura;
        etiqueta_arbol_mas_alto = etiqueta;
      }
      etiqueta++;
      System.out.println("Altura del arbol (" + etiqueta + "):");
      altura = sc.nextInt();
    }
    if (altura_arbol_mas_alto == -1) {
      System.out.println("No hay mas arboles");
    } else {
      System.out.println("El arbol mas alto es: " + altura_arbol_mas_alto);
      System.out.println("La etiqueta es: " + etiqueta);
    }
  }
}
