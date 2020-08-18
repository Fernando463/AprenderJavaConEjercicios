/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 */
package aprenderjavaconejercicios;


public class Tema4Ejercicio04Mejorado {
  public static void main(String[] args){
    
    System.out.print("Por favor, introduce el número de horas trabajadas"
      + " durante la semana: ");
    
    int horas=Integer.parseInt(System.console().readLine());
    int sueldo;
    
    if(horas >= 0 && horas <= 40){
      sueldo=(horas * 12);
           
    }else{
      sueldo=(((horas - 40) * 16)+ (40 * 12));
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldo
       + " euros");
  }
  
}
