/**
 * Tema 5 Bucles. 
 * 
 * Ejercicio 23.
 *
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 *
 * @author Fernando463.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /*
        
        System.out.println("Vete introduciendo números y pulsa enter:");
        int num ;
        int suma = 0;
        int contador = 0;
        int media = 0;
        
        do{                                                                       // Con bucle do...while.
            num = sc.nextInt();
            suma += num;
            contador ++;
            media = suma/contador;
        }while(suma <= 10000);
        
        System.out.println("El total acumulado es: " + suma);
        System.out.println("Se han introducido: " + contador + " números");
        System.out.println("La media es: " + media);
        
        */
    
    



 

     
        System.out.println("Vete introduciendo números y pulsa enter:");         // Con bucle while.
        int num ;
        int suma = 0;
        int contador = 0;
        int media = 0;

    while(suma <= 10000){
        num = sc.nextInt();
        suma += num;
        contador ++;
        media = suma/contador;

    }

        System.out.println("El total acumulado es: " + suma);
        System.out.println("Se han introducido: " + contador + " números");
        System.out.println("La media es: " + media);



    }
}