/*
 * Programa que calcula el área de un rectángulo. Introducimos por 
 * teclado su base y su altura.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema3Ejercicio05 {
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base y la altura del rectángulo, separadas por un espacio: ");
    
    int base= s.nextInt();
    int altura= s.nextInt();
    
    int area;
    area= base*altura;
    
    System.out.println("El área del rectángulo es: " + area);
  }
  
}
