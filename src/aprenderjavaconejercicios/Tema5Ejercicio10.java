/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero = 1;
        double suma = 0;
        double cont = 0;
        
        System.out.println("Vamos a calcular la media de los números que introduzcas.");
        System.out.println("Vaya introduciendo números. Pare con un número negativo.");
        
        while( numero > 0){
            
        numero = sc.nextDouble();
        suma += numero;
        cont++;  
        }
        
        
        System.out.println("La media de los números introducidos es: " + ((suma - numero)/(cont - 1)) );
        
    }
    
}
