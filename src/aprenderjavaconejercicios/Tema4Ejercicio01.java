/*
 * Programa que pide por teclado un día de la semana y nos dice que asignatura
 * toca a primera hora ese día.
 */
package aprenderjavaconejercicios;

 
public class Tema4Ejercicio01 {
  public static void main(String[] args){
    
    System.out.print("Por favor, introduce qué día de la semana es hoy, con letra: ");
    
    
    String dia;
    dia=System.console().readLine();
    
    if("lunes".equals(dia)){
      System.out.println("Hoy es lunes y la primera clase es PROG");     
    }
    else if("martes".equals(dia)){
      System.out.println("Hoy es martes y la primera clase es SS.II");
    }
    else if("miercoles".equals(dia)){
      System.out.println("Hoy es miércoles y la primera clase es EE.DD");
    }
    else if("jueves".equals(dia)){
      System.out.println("Hoy es jueves y la primera clase es LL.MM.");
    }
    else if("viernes".equals(dia)){
      System.out.println("Hoy es viernes y la primera clase es FOL");
    }
    else if("sabado".equals(dia)||"domingo".equals(dia)){
      System.out.println("Los fines de semana son para descansar");
    }
    else{
      System.out.println("No has introducido un día de la semana");
    }
   
    
  }
  
}
