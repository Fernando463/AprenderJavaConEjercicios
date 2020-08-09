/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula
 * V=1/3.pi.r2.h
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema3Ejercicio09 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce el radio y la altura del cono,en centímetros, separados por un espacio: ");
    
    int radio=s.nextInt();
    int altura=s.nextInt();
    double pi=3.1415;
    double v;
    double elevado=Math.pow(radio,2);
    
    v=(pi*elevado*altura)/3;
    
    System.out.println("El volumen del cono es de: "+v+" centímetros");
  }
  
}
