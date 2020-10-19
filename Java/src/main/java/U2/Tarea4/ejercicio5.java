package U2.Tarea4;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Escribe un programa que muestre la hora actual
public class ejercicio5 {

  public static void main(String[] args) {
    int hora, minutos, segundos;
    Calendar calendario;
    calendario = new GregorianCalendar();
    hora = calendario.get(Calendar.HOUR_OF_DAY);
    minutos = calendario.get(Calendar.MINUTE);
    segundos = calendario.get(Calendar.SECOND);
    System.out.println(hora + ":" + minutos + ":" + segundos);
  }
}
