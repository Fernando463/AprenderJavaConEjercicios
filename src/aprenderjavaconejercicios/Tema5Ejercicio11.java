/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema5Ejercicio11 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero y pulsa enter: ");
        int num = sc.nextInt();
        int i;
        int numero,cuadrado,cubo;
        
        
        
        for(i = num + 1; i <= num + 5; i++){
            numero = i;
            cuadrado = i * i;
            cubo = i * i * i;
            
            
            System.out.println(i +"   "+ cuadrado +"   "+ cubo );
        }
       
        
        
            
            
            
            
            
        
    }
    
}
