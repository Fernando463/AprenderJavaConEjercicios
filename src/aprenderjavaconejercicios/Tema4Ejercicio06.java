/*
 Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = raiz(2h/g), siendo g = 9.81m/s2
 */
package aprenderjavaconejercicios;


public class Tema4Ejercicio06 {
  
  final static double g=9.81;
  
  public static void main(String[] args){
    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Introduce la altura del objeto, en metros: ");
    Double h=Double.parseDouble(System.console().readLine());
    double t;
    t= Math.sqrt((2*h)/g);
    
    System.out.printf("El objeto tarda %.2f segundos en caer.\n" , t);
  }
  
}
