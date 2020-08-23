/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 */
package aprenderjavaconejercicios;


public class Tema4Ejercicio09 {
  
  public static void main(String[] args){
    System.out.println("Vamos a resolver una ecuación de segundo grado.");
    System.out.print("Introduce el valor de a: ");
    Double a= Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    Double b= Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de c: ");
    Double c= Double.parseDouble(System.console().readLine());
    
    /* Si el discriminante (b cuadrado -4ac) de la ecuación es menor que cero,
    no tiene solución real.Vamos a comprobar esta condición con un IF...ELSE.
    */
    
    if((Math.pow(b,2)-(4 * a * c)) < 0){
      System.out.println("El discriminante es menor que cero, la ecuación no tiene"
        + " solución real");
    }
    else{
    
    double x1;
    double x2;
    
    x1= (-b + Math.sqrt((b*b)-(4*a*c)))/2*a;
    
    x2=(-b - Math.sqrt((b*b)-(4*a*c)))/2*a;
    
    System.out.println("La raiz x1 = " + x1);
    
    System.out.println("La raiz x2 = " + x2);

    }
    
  }
  
}
