/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 */
package aprenderjavaconejercicios;


public class Tema4Ejercicio14 {
  
  public static void main(String[] args){
    
    int num;
    
    System.out.print("Introduce un número entero y pulsa enter: ");
    num=Integer.parseInt(System.console().readLine());
    
    if((num % 2 == 0)&&(num % 5 == 0)){
      System.out.println(num + ": Es par y divisible por 5. ");    
    }
    else if(num % 2 == 0){
      System.out.println(num + ": Sólo es par");
    }
    else if(num % 5 == 0){
      System.out.println(num + ": Sólo es divisible por 5");
    }
    else{
      System.out.println("El numero introducido ni es par ni es divisible por 5");
    }
    
  }
}
