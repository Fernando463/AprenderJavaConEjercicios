/*
 * Programa que calcula el total de una factura a partir de la base imponible.
 * Suponemos que TOTAL=base imponible + IVA. 
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema3Ejercicio07 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce el importe de la factura y el IVA, separados por un espacio: ");
    
    double importe= s.nextDouble();
    double iva=s.nextDouble();
    double total;
    
    total=importe*(1+(iva/100));
    
    System.out.println("El TOTAL de la factua es: " + total);
    
  }
  
}
