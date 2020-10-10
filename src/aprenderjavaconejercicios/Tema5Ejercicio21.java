/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;
public class Tema5Ejercicio21 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int contadorImpares = 0;
        int sumadorImpares = 0;
        int mediaImpares = 0;
        int mayorPares = 0;
        int numero;
        
        System.out.println("Introduce números y pulsa enter.");
        System.out.println("Para parar la entrada, introduce un número negativo. ");
        
        do{
        
            numero = sc.nextInt();
            if(numero >= 0){// Contador de números introducidos.
                contador ++;
            }
            if(numero % 2 == 1){
                contadorImpares ++;
                sumadorImpares += numero;
                mediaImpares = sumadorImpares/contadorImpares;  
            }else{
                if(numero > mayorPares){
                    mayorPares = numero;  // Mayor de los pares.
                }
                
            }
        
        
        }
        while(numero >= 0);
        
        System.out.println("Has introducido " + contador + " números. ");
        System.out.println("La media de los impares es: " + mediaImpares);
        System.out.println("El mayor de los pares es: " + mayorPares);
    }
}