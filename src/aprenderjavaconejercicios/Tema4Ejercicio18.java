/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema4Ejercicio18 {
  
  public static void main(String[] args){
    
    /*
    NOTA: Para calcular el número de dígitos del número introducido:
    Por ejemplo, si el número leído es 1234 haremos las siguientes operaciones:
    1234 / 10 = 123
    123 / 10 = 12
    12 / 10 = 1
    1 / 10 = 0
    hemos realizado 4 divisiones hasta obtener un cero como cociente, por lo tanto el número tiene 4 cifras.
    
    NOTA: Para saber cual es la primera cifra de un número, dividimos ese número
    entre 10^(dígitos del numero-1) y la parte entera de esta división es la primera cifra
    de dicho número.
    */
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero y pulsa enter:");
    int num = s.nextInt();
    
    // Vamos a calcular el número de cifras del número introducido:
    int cifras = 0;
    int numero = num;
    while(numero != 0){
      numero = numero/10;
      cifras ++;      
    }
    
    //System.out.println("El número: " + num + " tiene " + cifras + " cifras.");
    
    // Vamos a calcular el primer dígito del número introducido.
    
    int digito;
    digito= (int)(num/Math.pow(10,cifras-1));
    
    if(cifras < 6){
    
    System.out.println("La primera cifra del número " + num + " es " + digito + ".");
    }
    else{
      System.out.println("El número introducido no puede tener más de cinco dígitos");
    }
    
  }
  
}
