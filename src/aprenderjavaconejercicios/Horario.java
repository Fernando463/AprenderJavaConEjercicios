
package aprenderjavaconejercicios;

/**
 *
 * @author ronin
 */
public class Horario {  //Uso de secuencias de escape para tabular y nueva línea.
    public static void main(String [] args){
        
        
    String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m";
    String black="\033[30m";
    
        System.out.println("Lunes\t\t"+rojo+"Física");
        System.out.println(black+"Martes\t\t"+verde+"Química");
        System.out.println(black+"Miércoles\t"+naranja+"Lenguaje");
        System.out.println(black+"Jueves\t\t"+azul+"Historia");
        System.out.println(black+"Viernes\t\t"+morado+"Medio");
        System.out.println("Vuelta al color negro");
    }
    
}
