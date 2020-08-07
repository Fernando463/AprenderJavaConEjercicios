/*
 * Conversor de peseta a euros. La cantidad a convertir
 * debe ser introducida por teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema3Ejercicio03Conversor {
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad de pesetas a convertir en euros y pulsa INTRO:");
    
    double numero=s.nextDouble();
    
    double total = (numero/166.386);
    
    System.out.println(numero+" pesetas son"+total+" euros");
  }
  
}
