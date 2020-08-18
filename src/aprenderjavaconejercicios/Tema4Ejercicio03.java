/*
 * Programa que dado un número del 1 al 7,escriba el correspondiente día de
 * la semana.
 */
package aprenderjavaconejercicios;


public class Tema4Ejercicio03 {
  
  public static void main(String[] args){
    
    System.out.print("Introduce un número del 1 al 7: ");
    int dia=Integer.parseInt(System.console().readLine());
    String diaSemana;
    
    switch(dia){
      case 1:
        diaSemana="Lunes";
        System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 2:
         diaSemana="Martes";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 3:
         diaSemana="Miércoles";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 4:
         diaSemana="Jueves";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 5:
         diaSemana="Viernes";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 6:
         diaSemana="Sábado";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      case 7:
         diaSemana="Domingo";
         System.out.println("El día introducido es: " + diaSemana);
        break;
        
      default:
        System.out.println("No exite ese día de la semana");
        
        
        
      
    }
    
    
  }
  
}
