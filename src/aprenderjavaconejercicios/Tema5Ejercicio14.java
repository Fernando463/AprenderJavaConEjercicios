/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio14 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos a calcular una potencia.");
        System.out.print("Introduce el número de la base: ");
        int base = sc.nextInt();
        System.out.print("Introduce el número del exponente: ");
        int exponente = sc.nextInt();
        int i = 0;
        int res = 1;
        /*
        while(i < exponente){                 // Con while.
            res *= base;
            i++;
        }
        */
        /*
        for(i = 0; i < exponente; i++){      Con for.
            res = res * base;
        }
        
        */
        if(exponente == 0){  // Si el exponente es 0, el resultado debe ser 1.
            res = 1;
        }
        else{
                 do{
                     res *= base;
                     i ++;
                     } while( i < exponente);     // con do...while.
        
        }
        System.out.println(base + " elevado a " + exponente + " = " + res);
    }
    
}
