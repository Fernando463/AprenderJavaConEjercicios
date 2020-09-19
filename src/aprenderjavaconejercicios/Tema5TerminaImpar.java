/*
 * Bucle for
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema5TerminaImpar {
    
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
        
      int numero = 0;
      String seguir;
      
      do{
          System.out.print("Dime un número ");
          numero = sc.nextInt();
          
          if(numero % 2 == 0){
              System.out.println("Qué bonito es el " + numero);
          }else{
              System.out.println("No me gustan los números impares, adiós");
          }
          
          System.out.print("¿Quiere continuar (s / n)? ");
          seguir = sc.next();
         
          
        } while( numero % 2 == 0 && (! seguir.equals("n")));
    
    }

}

