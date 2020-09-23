/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 */
package aprenderjavaconejercicios;

/* Se va a hacer el cálculo con divisiones sucesivas del número entre 10 y contando el 
 * número de divisiones, hasta que el cociente sea cero (número de divisiones igual a
 * número de dígitos).

*/

import java.util.Scanner;

public class Tema5Ejercicio09 {
    public static void main(String[] args){
        
        /*
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Vamos a calcular el número de dígitos de un número entero.\n"
                + "Introduce un número y pulsa enter: ");
        int numero = sc.nextInt();
        int cociente = numero;
        int contador = 0;
        
        while(cociente > 0){                                                             // Cálculo con enteros.
            cociente = cociente / 10;                                                    // Máximo número entero: 2147483647.
            contador += 1;
    }
         System.out.println("El número " + numero + " tiene " + contador + " dígitos.");

        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Vamos a calcular el número de dígitos de un número 'double'.\n "  // Cálculo con double.
                + "Introduce un número y pulsa enter: ");
        double numero = sc.nextDouble();
        double cociente = numero;
        int contador = 0;
        
        while(cociente > 0){
            cociente = (int) (cociente / 10);
            contador ++;
        }
        System.out.println("El número " + (int) numero + " tiene " + contador + " dígito/s.");
        

    }

    
}
