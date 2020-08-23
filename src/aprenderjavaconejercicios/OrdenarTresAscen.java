/*
 * Programa que ordena en orden ascendente tres números introducidos
 * por teclado(num1, num2, num3).
 */
package aprenderjavaconejercicios;


public class OrdenarTresAscen {
  public static void main(String[] args){
    
    int num1, num2, num3, aux;
    
    System.out.println("Vamos a ordenar tres números de forma ascendente");
    
    System.out.print("Introduce el primer número: ");
    num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo número: ");
    num2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el primer número: ");
    num3 = Integer.parseInt(System.console().readLine());
    
    if(num1 > num2){
      aux = num1;
      num1=num2;
      num2=aux;
    }
    if(num2 > num3){
      aux=num2;
      num2=num3;
      num3=aux;
    }
    if(num1 > num2){
      aux = num1;
      num1=num2;
      num2=aux;
    }
    
    System.out.print("El orden ascendente es: " + num1 +", " +num2+", " + num3);
  }
  
}
