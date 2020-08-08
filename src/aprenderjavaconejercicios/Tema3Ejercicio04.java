/*
 * Programa que suma, resta, multiplica y divide dos números
 * introducidos por teclado.
 * Vamos a usar System.console().readLine() para la entrada.
 */
package aprenderjavaconejercicios;


public class Tema3Ejercicio04 {
  
  public static void main(String[] args){
    
    String numero;
    System.out.print("Por favor introduce un número y pulsa INTRO.");
    numero=System.console().readLine();
    double numero1;
    numero1=Double.parseDouble(numero);
    
    System.out.print("introduce el segundo número y ulsa INTRO.");
    numero=System.console().readLine();
    double numero2;
    numero2=Double.parseDouble(numero);
    
    double suma=(numero1+numero2);
    double resta= numero1-numero2;
    double producto= (numero1*numero2);
    double division= numero1/numero2;
    
    System.out.println("La suma de los dos números es: " + suma);
    System.out.println("La resta del primero menos el segundo es: " + resta);
    System.out.println("El producto de los dos números es: " + producto);
    System.out.println("La división del primero entre el segundo es: " + division);
    
  }
  
}
