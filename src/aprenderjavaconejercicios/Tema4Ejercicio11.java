/*
 * Tema 4, ejercicio 11.
 *
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 */
package aprenderjavaconejercicios;

public class Tema4Ejercicio11 {
  public static void main(String[] args){
    
    
    
    System.out.println("Dada una hora, vamos a calcular los segundos restantes hasta media noche");
    
    System.out.print("Introduce la hora, en formato 00 a 23: ");  
    int hora=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos, en formato 00 a 59: ");
    int minutos=Integer.parseInt(System.console().readLine());
    
    if((hora < 0 || hora >23) || (minutos < 0 || minutos > 59)){
      System.out.println("La hora introducida no es correcta");
    }
    else{
      int segundosDia;
      segundosDia = 24 * 3600;
      int segundosRestantes=(segundosDia - ((hora * 3600) + (minutos * 60)));
    
    System.out.print("Quedan " + segundosRestantes + " segundos hasta medianoche");
    }
  }
  
}
