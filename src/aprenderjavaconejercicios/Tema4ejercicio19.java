/*
 *Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 *puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema4ejercicio19 {
  public static void main(String[] args){
    /*
    int digitos= 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero y pulsa enter: ");
    int numero = sc.nextInt();
    
    if(numero/10 == 0){
      digitos = 1;
  }
    else if(numero/100 == 0){
      digitos = 2;
    }
    else if(numero/1000 == 0){
      digitos = 3;
    }
    else if(numero/10000 == 0){
      digitos = 4;
    }
    else if(numero/100000 == 0){
        digitos = 5;
        
    }
    if(numero > 99999){
      System.out.println("No puedes introducir un número de más de cinco cifras");     
    }
    
    System.out.println("El número " + numero + " tiene " + digitos + " cifras");
  */







    int digitos= 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero y pulsa enter: ");
    int numero = sc.nextInt();
    
    if(numero < 10){
      digitos = 1;
  }
    if((numero >= 10) && (numero < 100)){
      digitos = 2;
    }
    if((numero >= 100) && (numero < 1000)){
      digitos = 3;
    }
    if((numero >= 1000) && (numero < 10000)){
      digitos = 4;
    }
    if((numero >= 10000) && (numero < 100000)){
        digitos = 5;    
    }
    
    
    System.out.println("El número " + numero + " tiene " + digitos + " cifras");

}
}