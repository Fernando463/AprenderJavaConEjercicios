/*
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
package aprenderjavaconejercicios;

/** Vamos a hacer la comprobación empleando varios IF y utilizando al resto de
 * la división entre 10 (último dígito) y la división entre n/10 elevado a n-1
 * (primer dígito).
 */

import java.util.Scanner;
public class Tema4Ejercicio20ConWhile {
  
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a comprobar si un número es capicúa ( si se lee igual"
      + " de\n izquierda a derecha que de derecha a izquierda).");
    System.out.print("Introduce un número entero positivo: ");
    int num = sc.nextInt();
    
    if(((num >= 10) && (num <= 99)) && ((num % 10) == (num / 10))){  // Números entre 10 y 99, comparamos el primer dígito con
      System.out.println("El número " + num + " es capicúa.");        // el segundo.
    }
    else if(((num >= 100) && (num <= 999)) && ((num % 10) == (num / 100))){  //Números entre 100 y 999, comparamos último con primero
      System.out.println("El número " + num + " es capicúa.");     
    }
    else if(((num >= 1000) && (num <= 9999)) && ((num % 10) == (num / 1000)) &&  //Números entre 1.000 9.999, comparamos último con
        (num/10)%10 == ((num / 100)%10)){                                   // primero y penúltimo con segundo.                                     
      System.out.println("El número " + num + " es capicúa."); 
    }
    else if(((num >= 10000) && (num <= 99999)) && ((num % 10) == (num / 10000)) &&  //Números entre 1.000 9.999, comparamos último con
        (num/10)%10 == ((num / 1000)%10)){                                      // primero y penúltimo con segundo. 
      System.out.println("El número " + num + " es capicúa."); 
    }
    else if(num > 99999){
        System.out.println("No introduzcas números de más de cinco dígitos");
    }
    
    
    else{
      System.out.println("El número " + num + " no es capicúa.");
    }
  }
  
  
}



/**************************************************************
 *************** INVERTIR UN NÚMERO ***************************
 * ************************************************************
 int resto;
    int invertido = 0;
    
    
    while( num > 0){
      resto = num % 10;
      invertido = invertido * 10 + resto;
      num /= 10;
    }
    
    System.out.println(invertido);
*/