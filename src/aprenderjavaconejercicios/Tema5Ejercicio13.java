/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int positivo = 0;
        for(i = 0; i < 10; i++){
            
            System.out.print("Introduce un número entero: ");
            int num = sc.nextInt();
                if(num >= 0){
                positivo ++;
                }
        }
        System.out.println("Positivos: " + positivo + "\n" + "Negativos: " + (10 - positivo));
        
    }
        }

