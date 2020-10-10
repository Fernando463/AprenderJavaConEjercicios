/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio17 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        int i;
        int suma = 0;
        int incremento;
        incremento = suma;
        if(num > 0){
            for( i = 0; i < 100; i ++){
                incremento ++;
                suma = suma + incremento;
            }
            System.out.println("El resultado de la suma de los cien números"
                + " siguientes a " + num + " es " + suma);
        }
        else{
            System.out.println("El número introducido no es positivo");
        }
        
    }
    
}
