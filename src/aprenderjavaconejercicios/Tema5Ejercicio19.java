/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
        *
       ***
      ***** 

      *****
       ***
        *
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema5Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el carácter para dibujar la pirámide: ");
        char caracter = sc.next().charAt(0);
        
        // *********************** PIRÁMIDE INVERTIDA ***************************
        
        
        int fila= altura;
        
        for(int i=1; i <= altura; i++){
            
            
            // Espacios en blanco.
            for( int j=1; j<=(altura-fila); j++){
                System.out.print(" ");
            }
            // Asteriscos.
            for( int k=1; k<=(2*fila)-1; k++){
                System.out.print(caracter);
            }
                
                
           System.out.println();
              fila --;
              
        }
        
             
        
        
        
        /*
        
          int fila = 1;
          int filas = 1;
        
        
        while( filas  <= altura){
            
          
            int i = 1;
            
            while(i <= (altura-fila)){
                System.out.print(" ");
                i++;
            }
            
            int j = 1;
            
            while(j <= (fila*2)-1){
                System.out.print(caracter);
                j++;
            }
            System.out.println();
            
            
            fila ++;
            filas ++;
            
        }
        
         */
        
        
    }
    
}




        /*
            
***************************************************** PIRÁMIDE INVERTIDA *************************


        int fila=3;
        for(int i=1; i<=altura;i++){
            
            
            // Espacios en blanco.
            for(int i=1; i<=(altura-fila); i++){
                System.out.print(" ");
            }

            for(int i=1; i<=(2*fila)-1; i++){
                System.out.print("*");
            }
                
                fila --;
                System.out.println();
        }
        */