/*
 * Realiza un programa que pida dos números y que luego
 * muestre el resultado de su multiplicación
 * con System.console().readLine().
 */
package aprenderjavaconejercicios;


public class Tema3Ejercicio01 {
  
  public static void main(String[] args){
    
    String numero;
    System.out.print("Por favor, introduce un número: ");
    numero=System.console().readLine();
    int primerNumero;
    primerNumero=Integer.parseInt(numero);
    
    System.out.print("introduce otro, por favor: ");
    numero=System.console().readLine();
    int segundoNumero;
    segundoNumero=Integer.parseInt(numero);
    
    int multiplicacion;
    multiplicacion=primerNumero * segundoNumero;
    
    System.out.println("El producto de los dos números es: " + multiplicacion);
  }
  
}

