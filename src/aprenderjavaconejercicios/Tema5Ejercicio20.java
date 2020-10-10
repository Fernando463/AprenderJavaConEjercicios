/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
        *
       * *
      *   *
     ******* 
 */
package aprenderjavaconejercicios;

import java.util.Scanner;
public class Tema5Ejercicio20 {
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
        
        
        
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = sc.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = sc.next();

        int espaciosInternos = 0;
        int fila=1;
        int varAltura =1;
        
        for(int filas=1; filas<=altura-1; filas++){
            
            for( int i=1; i<=(altura-fila);i++){
                System.out.print(" ");
            }
            System.out.print(relleno);
            
            for( int i=1; i<espaciosInternos; i++){
                System.out.print(" ");
            }
            
            if(varAltura>1){
              System.out.print(relleno);   
            }
           
            System.out.println();
            
            
            
            
           fila++;
           espaciosInternos +=2;
           varAltura ++;
        }
    
            for(int i=1; i<(2*altura); i++){
                System.out.print(relleno );
            }
    
    
    
    
  }
}
   

/*
        **********SOLUCION LIBRO**********

    
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
*/
    
    

