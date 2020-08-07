/*
 * Hacer un conversor de euros a pesetas.
 * La cantidad de euros a convertir debe
 * ser introducida por teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;



public class Tema3Ejercicio02Convesor {
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad de euros a convertir en pesetas y pulsa INTRO: ");
    
    double cantidad = s.nextDouble();
    
    double euros = cantidad*166.386;
    
    System.out.println(cantidad + " euros son: " + euros + " euros.");
    
    
  }
  
}
