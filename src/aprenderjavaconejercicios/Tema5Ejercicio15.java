/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
package aprenderjavaconejercicios;
import java.util.Scanner;


public class Tema5Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base de la potencia: ");
        double base = sc.nextDouble();
        System.out.print("Introduce el exponente de la potencia: ");
        int expo = sc.nextInt();
        int i = 0;
        double res = 1;
        
        for(i = 0; i < expo; i ++){
           res *= base;
           System.out.print((int) res + " ,");
           //System.out.printf("%.0f ,", res);
            
        }
    }
    
}
