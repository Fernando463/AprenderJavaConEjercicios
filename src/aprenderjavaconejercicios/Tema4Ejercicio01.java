/*
 * Programa que pide por teclado un día de la semana y nos dice que asignatura
 * toca a primera hora ese día.
 */
package aprenderjavaconejercicios;

 
public class Tema4Ejercicio01 {
  public static void main(String[] args){
    
    System.out.print("Por favor, introduce qué día de la semana es hoy, con letra");
    System.out.print(" y no te olvides del acento (lunes, martes, ...");
    
    String dia;
    dia=System.console().readLine();
    
    if(dia=="lunes"){
      System.out.println("Hoy es lunes y la primera clase es Programación");     
    }
    else if(dia=="martes"){
      System.out.println("Hoy es martes y la primera clase es SS.II");
    }
    else if(dia=="miércoles" ||dia=="miercoles"){
      System.out.println("Hoy es miércoles y la primera clase es EE.DD");
    }
    else if(dia=="jueves"){
      System.out.println("Hoy es jueves y la primera clase es LL.MM.");
    }
    else if(dia=="viernes"){
      System.out.println("Hoy es viernes y la primera clase es FOL");
    }
    else if(dia=="sábado"||dia=="sabado"||dia=="domingo"){
      System.out.println("Los fines de semana son para descansar");
    }
    else{
      System.out.println("Esa palabra no es un día de la semana");
    }
  }
  
}
