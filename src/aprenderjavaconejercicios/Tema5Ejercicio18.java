/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio18 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("introduce el segundo número entero: ");
        int num2 = sc.nextInt();
        int menor,mayor,aux;
        
        if( num1 != num2){                                                        // Validación de que los números introducidos son distintos.
            if( num1 > num2){                                                     // Ordenamos los números.
                mayor = num1;
                menor = num2;
            }else{
                mayor = num2;
                menor = num1;
            }
                while(menor < mayor){
                    System.out.print(menor + " ");
                    menor += 7;
                }
            
            
        }else{
            System.out.println("Los dos números son iguales, no se puede hacer el cálculo");
        }

    
    }   
    
}
