/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */
package aprenderjavaconejercicios;

public class Tema4Ejercicio08 {
  
   public static void main(String[] args){
    System.out.println("Programa que calcula la media de tres notas");
    System.out.print("Introduce la primera nota: ");
    Double nota1=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    Double nota2=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercera nota: ");
    Double nota3=Double.parseDouble(System.console().readLine());
    
    double media;
    media=((nota1 + nota2 + nota3)/3);
    
    if(media < 5){
      System.out.println("Tu calificación es insuficiente");
    } 
    if(media == 5 && media < 6){
           System.out.println("Tu calificación es suficiente");
    }
    if(media == 6 && media <7){
           System.out.println("Tu calificación es bien");
    }
    if(media == 7 && media <= 8){
            System.out.println("Tu calificación es notable");
    }
    if(media >= 8 && media <= 10){
            System.out.println("Tu calificación es sobresaliente");
    }
           
  }
  
}
