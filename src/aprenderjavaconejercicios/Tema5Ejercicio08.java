/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;
public class Tema5Ejercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para presentar su tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        /*
        int i = 0;                                                                     // CON WHILE.
        while(i <= 10){
            System.out.println( numero + " x " + i + " = " + (numero * i));
            i ++; 
        }
        */
        /*
        
        int i = 0;
        do{
            System.out.println(numero +" x " +  i  +  " = " + (numero * i));           // CON DO...WHILE.
            i++;
        }
        while(i <= 10);
        
        */
        
        int i = 0;
        for(i= 0; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));            // CON FOR.
        }
    }
    
}
