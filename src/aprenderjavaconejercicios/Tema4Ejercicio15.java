/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado, que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema4Ejercicio15 {
  
  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
    
    
    
    
    System.out.print("Introduce el carácter con el que vamos a construir la pirámide: ");
    String c = s.nextLine();
    
    System.out.print("Indica la orientación del vértice de la pirámide:\n"
      + " 1 arriba\n 2 abajo\n 3 derecha\n 4 izquierda\n");
    System.out.print("Elige un número: ");
    int orientacion = s.nextInt();
    
    if(orientacion == 1){
      System.out.println("    "+c);
      System.out.println("   "+c+c+c);
      System.out.println("  "+c+c+c+c+c);
    }
    else if(orientacion == 2){
      System.out.println(" "+c+c+c+c+c);
      System.out.println("  "+c+c+c);
      System.out.println("   "+c);
    }
    else if(orientacion == 3){
      System.out.println(c);
      System.out.println(c+"  "+c);
      System.out.println(c+"  "+c+"  "+c);
      System.out.println(c+"  "+c);
      System.out.println(c);
    }
    else if(orientacion == 4){
     System.out.println("    "+c);
      System.out.println("  "+c+" "+c);
      System.out.println(c+" "+c+" "+c);
      System.out.println("  "+c+" "+c);
      System.out.println("    "+c); 
    }
    
  }
  
}
