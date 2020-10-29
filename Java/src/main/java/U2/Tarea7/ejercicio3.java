package U2.Tarea7;
/*Realiza un programa que genere una letra minúscula de forma aleatoria.
Investiga el uso de la función Math.random(). Investiga también sobre el sistema de
codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.*/
public class ejercicio3 {
  public static void main(String[] args) {
    String letra_minuscula = "";

    int caracteres = (int) (Math.random() * 20) + 2;
    int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
    letra_minuscula = letra_minuscula + (char) codigoAscii;
    System.out.println(letra_minuscula);
  }
}
