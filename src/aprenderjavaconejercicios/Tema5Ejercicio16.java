/*
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio16 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para comprobar si es primo: ");
        int num = sc.nextInt();
        int i;
        int contador = 0;
        for(i = 2; i < num; i ++){  // Empiezo a dividir en 2, porque todo número es divisible porsible por 1.
            if( (num % i) == 0){    // El bucle acaba antes del número, porque todo número es divisible por sí mismo.
                contador += 1;
            }
        }
        if(contador > 0){
            System.out.println("El número " + num + " NO es primo " + contador);  // Añado contador para ver el número de divisiones exactas.
        }else{
             System.out.println("El número " + num + " SÍ es primo " + contador);
        }
    }
    
} 
 