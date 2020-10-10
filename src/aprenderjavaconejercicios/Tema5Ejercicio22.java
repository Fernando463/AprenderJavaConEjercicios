/**
 * Aprende java con ejercicios.
 *
 * Tema 5, Ejercicio nº 22.
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @autor: Fernando463.
 */
package aprenderjavaconejercicios;


public class Tema5Ejercicio22 {
    public static void main(String[] args){
        
        
        for(int n = 2; n<= 100; n++){
            boolean esPrimo=true;
            
            for(int i=2; i<n; i++){
                
                if(n%i == 0){
                    esPrimo = false;
                }
            }
            
            if(esPrimo){
                System.out.print(n + ",");
            }
        }
        
        
        
        
        
       
           
    }
    
}



/*
// Cómo calcular si un número es primo.

        int numero = 131;
        boolean esPrimo = true;
       
       for( int i =2; i< 100; i++){
           if(numero % i == 0){
               esPrimo = false;
           }
       }
       
       if(esPrimo){
           System.out.println("El número " + numero + " es primo");
       }else{
           System.out.println("El número " + numero + " no es primo");
       }

*/