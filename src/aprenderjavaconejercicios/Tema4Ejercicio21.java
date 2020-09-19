/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 *pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 *Si la media de los dos controles da un número mayor o igual a 5, el alumno
 *está aprobado y se mostrará la media. En caso de que la media sea un número
 *menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 *se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 *ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 *de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 *la nota media anterior.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema4Ejercicio21 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, media ;
        
        
        System.out.print("Nota del primer control: ");
         nota1 = sc.nextDouble();
        
        System.out.print("Nota del segundo control: ");
         nota2= sc.nextDouble();
         
         media = ((nota1 + nota2)/2);
        
         if(media < 5){
             System.out.print("¿Cual ha sido el resultado de la recuperación? "
                     + "(apto/no apto): ");
             String recu = sc.next();      // sc.nextLine no esperaba la entrada del dato, finalizaba el programa,
                if( recu.equals("apto")){
                    media = 5;
                }
        
         }
         
         System.out.println("Tu nota de programación es " + media);
    }
}
