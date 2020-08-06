/*
 * Programa que nos pide dos números, los introducimos por teclado
 * y nos devuelve su producto, empleando la clase Scanner.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema3Ejercicio01Scanner {
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce dos números separados por un espacio: ");
    
    int numero1= s.nextInt();
    int numero2= s.nextInt();
    
    int producto;
    
    producto= numero1 * numero2;
    
    System.out.println("El producto de los dos números es: " + producto);
    
    
  }
  
}
