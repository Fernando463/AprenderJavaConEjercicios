/*
 * Realiza un programa que calcule la media de tres notas.
 */
package aprenderjavaconejercicios;

public class Tema4Ejercicio07 {
  
  public static void main(String[] args){
    System.out.println("Programa que calcula la media de tres notas");
    System.out.print("Introduce la primera nota: ");
    Double nota1=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    Double nota2=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercera nota: ");
    Double nota3=Double.parseDouble(System.console().readLine());
    
    double media;
    media=((nota1 + nota2 + nota3)/3);
    
    System.out.printf("La nota media de las tres es: %.2f", media);
           
  }
  
}
