/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos,  se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio07 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int combinacion = 1234;  // Combinación de la caja fuerte.
        int i = 4;
        while(i > 0){
            System.out.print("Introduce la combinación de la caja (número de 4 cifras): ");
            int comb = sc.nextInt();
            if(comb == combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                i = 0;  // Fuerzo el final del bucle, ya que i-- va a hacer i negativa.
            }
            else{
                System.out.println("Lo siento, esa no es la combinación.");
            }
            i--;  // Decrementa i (que de acertar la combinación va a valer 0).Fin del bucle.
        }
        
    }
    
}
