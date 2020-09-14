/*
 *Escribe un programa que diga cuál es la última cifra de un número entero
 *introducido por teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema4Ejercicio17 {
  
  public static void main(String[]args){
    
    Scanner s = new Scanner(System.in);
    
    
    
    /* NOTA: Para saber cual es la última cifra de un número, obtenemos el resto de su división
     entre 10 y ese resto es la última cifra (número % 10 = última cifra).
    */
    
    System.out.print("Introduce un número entero y pulsa enter: ");
    int num = s.nextInt();
    int cifra = num%10;
    
    System.out.println("La última cifra del número " + num + " es " + cifra);
    

    
 
     
     
  }
}
