/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
    1
   121
  12321
 1234321
 */
package aprenderjavaconejercicios;

import java.util.Scanner;
public class Tema5Ejercicio24 {
    public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduce un número y pulsa enter: ");
        int numero = sc.nextInt();
        int fila = 1;
        int i,j,k;
        
        for( i=1; i<=numero; i++){
            if(numero == 1){
                System.out.printf("%d",numero);
            }else{
                for( j=1; j<fila;j++){
                    System.out.printf("%d",j);
                }
                System.out.print(i);
                
                for( k=fila-1;k>=1;k --){
                   System.out.printf("%d",k);
                }
                fila ++;
                //System.out.printf(" %d,% d, %d",j,i,k);
            }
            System.out.println();
        }
    }
    
}
