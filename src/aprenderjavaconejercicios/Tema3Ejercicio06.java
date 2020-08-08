/*
 * Programa que calcula el área de un triángulo. La base y la altura se introducen
 * por teclado. Área triángulo = (base * altura)/2.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema3Ejercicio06 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce la base y la altura del triángulo, separadas por un espacio: ");
    
    int base=s.nextInt();
    int altura=s.nextInt();
    
    double area;
    area=(base*altura)/2;
    
    System.out.println("El área del triángulo es: "+area);
  }
  
}
