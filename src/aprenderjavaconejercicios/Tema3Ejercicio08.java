/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema3Ejercicio08 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce el número de horas trabajadas esta semana: ");
    
    double horas=s.nextDouble();
    int precio=12;
    double salario;
    
    salario=horas*precio;
    
    System.out.println("El salario de esta semana es de: "+salario+" euros");
  }
  
}
