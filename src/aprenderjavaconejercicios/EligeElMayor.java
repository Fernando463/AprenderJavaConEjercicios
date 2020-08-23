/*
 * Dados tres enteros, elegir el mayor de ellos.
 */
package aprenderjavaconejercicios;


public class EligeElMayor {
  
  public static void main(String[] args){
    
    System.out.println("Vamos a ordenar tres números enteros introducidos por teclado");
    
    System.out.print("Introduce el primer número y pulsa enter: ");
    int num1=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo número y pulsa enter: ");
    int num2=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el tercer número y pulsa enter: ");
    int num3=Integer.parseInt(System.console().readLine());
    
    if(num1 > num2){
        if(num1 > num3){
          System.out.println("El mayor es " + num1);
        }
        else{
          System.out.println("El mayor es: " + num3);
      }
    }
    else if(num2 > num3){
      System.out.print("El mayor es: " + num2);
    } 
    else{
      System.out.print("El mayor es: " + num3);
    }
    
    }
  }
  

