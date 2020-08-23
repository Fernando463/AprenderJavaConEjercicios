/*
 * Cómo intercambiar dos variables, utilizando una variable auxiliar.
 */
package aprenderjavaconejercicios;


public class IntercambioVariables {
  
  public static void main(String[] args){
    
    int a= 3;
    int b=6;
    int aux;
    
    // Intercambia sus valores ( a=6, b=3).
    
    aux=a;
    a=b;
    b=aux;
    
    
    
    
    System.out.println("El valor de a es: " + a);
    System.out.println("El valor de b es: " + b);

    
  }
  
}
