/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * SOLUCIÓN DEL AUTOR DEL LIBRO.
 */
package aprenderjavaconejercicios;

public class Tema4Ejercicio14Mejor {
  
  public static void main(String[] args){
    int num;
    System.out.print("Introduce un numero entero: ");
    num= Integer.parseInt(System.console().readLine());
    
    if((num % 2)== 0){
      System.out.print("El numero introducido es par");
    }else{
      System.out.print("El numero introducido es impar");
    }
    if((num % 5)== 0){
      System.out.println(" y divisible entre 5");
    }else{
      System.out.println(" y no es divisible por 5");
    }  
    
  }
  
}
